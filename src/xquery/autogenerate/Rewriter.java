package xquery.autogenerate;
import javafx.util.Pair;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
// import org.omg.CORBA.INTERNAL;
import xquery.autogenerate.XQueryParser;
import java.util.*;


public class Rewriter {
    private CharStream input = null;

    public String returnoutput;
    public Map<Pair<String, String>, Integer> group_map = new LinkedHashMap< Pair<String, String>, Integer>();

    public Map<Pair<Integer, Integer>, ArrayList< Pair<String, String> > > join_var_map = new HashMap<Pair<Integer, Integer>, ArrayList< Pair<String, String> >>();

    public Map<Pair<String, String>, Integer> join_constant_map = new HashMap<Pair<String, String>, Integer>();
    public Map<Set<Integer>, String> join_res = new HashMap<>();

    public Rewriter(CharStream c){
        input = c;
    }

//    public void construction(XQueryParser.Xq_ForLetWhereReturnContext ctx){
//        XQueryParser.ForClauseContext for_clause = ctx.forClause();
//        XQueryParser.WhereClauseContext where_clause = ctx.whereClause();
//        XQueryParser.ReturnClauseContext return_clause = ctx.returnClause();
//
//        int for_quety_size = for_clause.xq().size();
//        int for_var_size = for_clause.var().size();
//
//        // For Analysis
//        for(int i = 0; i < for_clause.xq().size(); i++){
//            String temp = for_clause.xq(i).getText();
//            System.out.println(temp);
//        }
//    }


    public void for_construction(XQueryParser.ForClauseContext for_ctx){
        Integer map_number = 1;



        Integer changes = 0;
        // do insertion several times until there is no changes
        do{
            // For Analysis
            changes = 0;
            Map<Pair<String, String>, Integer> add_map = new HashMap< Pair<String, String>, Integer>();


            for(int i = 0; i < for_ctx.xq().size(); i++){
                String varname = for_ctx.var(i).getText();
                String querycontent = for_ctx.xq(i).getText();
                Pair<String, String> var_xq_pair = new Pair<String, String>(varname, querycontent);

                // starts with doc means this is a new group of elements
                if(querycontent.startsWith("doc")){
                    if(group_map.get(var_xq_pair) == null){
                        group_map.put(var_xq_pair, map_number);
                        map_number++;
                    }
                }
                // does not start with a doc, already has a group, find it
                else{
                    int position = querycontent.indexOf('/') == -1 ? querycontent.length() : querycontent.indexOf('/');
                    // get the prefix of current xquery
                    String prefixVar = querycontent.substring(0, position);

                    // iterate over all the existing mapping
                    for(Map.Entry<Pair<String, String>, Integer> entry: group_map.entrySet()){

                        Integer group_index = entry.getValue();
                        String group_varname = entry.getKey().getKey();
                        // if found

                        if(prefixVar.equals(group_varname)){
                            if(group_map.get(var_xq_pair) == null){
                                // System.out.println(prefixVar + " " + group_varname);
                                add_map.put(var_xq_pair, group_index);
                                changes++;
                            }
                        }
                    }
                }
            }
            // merge two maps
            group_map.putAll(add_map);
        }while(changes != 0);



//        // print out all the mappings
//        for(Map.Entry<Pair<String, String>, Integer> entry: group_map.entrySet()){
//            System.out.println("Pair: " + entry.getKey() + " Group Index: " + entry.getValue());
//        }

    }

    public void where_construction(XQueryParser.WhereClauseContext where_ctx){
//        String s = where_ctx.getText();
//        System.out.println(s);
        XQueryParser.CondContext condition = where_ctx.cond();
        combine(condition);
        System.out.println(join_constant_map);
        System.out.println(join_var_map);
    }

    public void combine(XQueryParser.CondContext cond_ctx){
        if(cond_ctx instanceof  XQueryParser.Cond_condANDcondContext){
            XQueryParser.Cond_condANDcondContext and_cond = (XQueryParser.Cond_condANDcondContext) cond_ctx;
            combine(and_cond.cond(0));
            combine(and_cond.cond(1));
        }
        else if(cond_ctx instanceof XQueryParser.Cond_xqVEQxqContext){
            XQueryParser.Cond_xqVEQxqContext veq_cond = (XQueryParser.Cond_xqVEQxqContext)cond_ctx;
            String equal_var1 = veq_cond.xq(0).getText();
            String equal_var2 = veq_cond.xq(1).getText();
            //System.out.println("Left: " + equal_var1 + " Right: " + equal_var2);

            // If the two arguments starts with $ sign
            if(equal_var1.startsWith("$") && equal_var2.startsWith("$")){
                Integer group_index1 = find_group(equal_var1);
                Integer group_index2 = find_group(equal_var2);
                if(group_index1 == -1 || group_index2 == -1){
                    System.out.println("Cannot find the group for the argument! " + equal_var1 + " " + equal_var2);
                }
                // make sure that the smaller element is in the first place\
                if(group_index1 > group_index2){
                    // swap index number
                    Integer temp;
                    temp = group_index1;
                    group_index1 = group_index2;
                    group_index2 = temp;

                    // swap String
                    String stemp;
                    stemp = equal_var1;
                    equal_var1 = equal_var2;
                    equal_var2 = stemp;
                }


                // if the two variable blongs to the same table
                if(group_index1.equals(group_index2)){
                    // treated as constant
                    Pair<String, String> temp_pair = new Pair<String, String>(equal_var1, equal_var2);
                    join_constant_map.put(temp_pair, group_index1);
                }
                else{
                    // we add the pair into the join_var_map as key
                    Pair<Integer, Integer> key_pair = new Pair<Integer, Integer>(group_index1, group_index2);
                    Pair<String, String> value_pair = new Pair<String, String>(equal_var1, equal_var2);

                    // if the key_pair is new, create a new key-value relation
                    if(join_var_map.get(key_pair) == null){
                        ArrayList<Pair<String, String>> value_array = new ArrayList<>();
                        value_array.add(value_pair);
                        join_var_map.put(key_pair, value_array);
                    }
                    // else, add the value pair to join_var_set
                    else{
                        join_var_map.get(key_pair).add(value_pair);
                    }
                }


            }
            // one of the argument is a constant. No need to change
            else{
                // make sure that the first arugment is at the first place
                if(!equal_var1.startsWith("$")){
                    String temp;
                    temp = equal_var1;
                    equal_var1 = equal_var2;
                    equal_var2 = temp;
                }
                Integer group_index = find_group(equal_var1);
                if(group_index == -1){
                    System.out.println("Cannot find the group index for the constant join.");
                }
                join_constant_map.put(new Pair<String, String>(equal_var1, equal_var2), group_index);
            }
        }
    }

    public Integer find_group(String var_name){
        for(Map.Entry<Pair<String, String>, Integer> entry: group_map.entrySet()){
            Integer group_index = entry.getValue();
            String group_varname = entry.getKey().getKey();

            if(group_varname.equals(var_name)) return group_index;

        }
        return -1;
    }

    public void return_construction(XQueryParser.ReturnClauseContext ret_ctx){
        String res;
        res = ret_ctx.getText().replace("return", "return ");
        res = res.replaceAll("\\$([A-Za-z0-9_]+)", "\\$tuple/$1/*");
        returnoutput = res;
    }

    public String makeOutput(){
        // first recover the for part
        String head = "for $tuple in ";
        String res = "";

        // we keep iterating the map until the map is empty
        while(!join_var_map.isEmpty()){

            // get an element from join_var_map
            Map.Entry<Pair<Integer, Integer>, ArrayList< Pair<String, String> >> entry = join_var_map.entrySet().iterator().next();
            Integer group1 = entry.getKey().getKey();
            Integer group2 = entry.getKey().getValue();

            // search the two element in join_res-->key, if found, merge the two join res, else, create new join_res entry.

            // first check if the join_res is empty
            if(!join_res.isEmpty()){
                // if not empty, check if group1 and group2 exist in join_res-->key
                //System.out.println("join_res is not empty " + "Group one: " + group1 + "Group two: " + group2);
                boolean modify = false;
                int whichone = 0;
                Map.Entry<Set<Integer>, String> res_elem_temp = new AbstractMap.SimpleEntry<Set<Integer>, String>(new HashSet<Integer>(),"");

                // iterate through the join_res to see whether there are two joins that could join together
                modify = false;
                for(Map.Entry<Set<Integer>, String> res_elem : join_res.entrySet()){

                    if(res_elem.getKey().contains(group1)){
                        res_elem_temp = res_elem;
                        modify = true;
                        whichone = 2;
                        break;
                    }
                    else if(res_elem.getKey().contains(group2)){
                        res_elem_temp = res_elem;
                        modify = true;
                        whichone = 1;
                        break;
                    }
                }

                if(whichone == 2 && modify){
                    update_res(group2, res_elem_temp, entry);
                }
                else if(whichone == 1 && modify){
                    update_res(group1, res_elem_temp, entry);
                }


                join_var_map.remove(entry.getKey());
            }
            else{
                // if empty, make the basic join result.
                // System.out.println("The origin size is: " + join_var_map.size());
                String left_string = basic_make_res(group1);
                String right_string = basic_make_res(group2);
                String join_string = join_make_res(left_string, right_string, entry);
                // System.out.println(join_string);
                join_var_map.remove(entry.getKey());
                // System.out.println("The later size is: " + join_var_map.size());
                Set<Integer> joined_group = new HashSet<Integer>();
                joined_group.add(group1);
                joined_group.add(group2);
                join_res.put(joined_group, join_string);


            }
        }

        for(Map.Entry<Set<Integer>, String> res_elem : join_res.entrySet()){
            res += head;
            res += res_elem.getValue();
        }
        res += "return \n";
        res += returnoutput;

        return res;
    }

    public void update_res(Integer group_index, Map.Entry<Set<Integer>, String> res_elem, Map.Entry<Pair<Integer, Integer>, ArrayList< Pair<String, String> >> entry){
        // delete the origin entry
        // System.out.println("The origin size is: " + join_res.size());
        join_res.remove(res_elem.getKey());
        // System.out.println("The later size is: " + join_res.size());

        // update the key
        Set<Integer> updated_key = res_elem.getKey();

        updated_key.add(group_index);

        // update the string
        String updated_string = join_make_res(res_elem.getValue(), basic_make_res(group_index), entry);



        // add the new entry
        join_res.put(updated_key, updated_string);

    }

    public String join_make_res(String s1, String s2, Map.Entry<Pair<Integer, Integer>, ArrayList< Pair<String, String> >> entry){
        String res = "join ( \n";
        res += s1;
        res += "\n";
        res += s2;
        ArrayList<String> equal_elem1 = new ArrayList<String>();
        ArrayList<String> equal_elem2 = new ArrayList<String>();

        for(int i = 0; i < entry.getValue().size(); i++){
            equal_elem1.add(entry.getValue().get(i).getKey());
            equal_elem2.add(entry.getValue().get(i).getValue());
        }
        res += "[";
        for(int i = 0; i < equal_elem1.size(); i++){
            res += equal_elem1.get(i);
            if(i < equal_elem1.size() - 1) res += ", ";
        }
        res += "], [";
        for(int i = 0; i < equal_elem2.size(); i++){
            res += equal_elem2.get(i);
            if(i < equal_elem2.size() - 1) res += ", ";
        }
        res += "]\n";
        res += ")\n";
        return res;
    }


    public String basic_make_res(Integer group1){
        String start_join = "join (\n";

        String left_res = "for ";


        ArrayList<String> group1_string = new ArrayList<>();


        // handling with the left result. First is for clause
        for(Map.Entry<Pair<String, String>, Integer> group_elem: group_map.entrySet()){
            Integer group_index = group_elem.getValue();
            if(group_index.equals(group1)){
                group1_string.add(group_elem.getKey().getKey());
                left_res += group_elem.getKey().getKey();
                left_res += " in ";
                left_res += group_elem.getKey().getValue();
                left_res += ",\n";
            }
        }
        // then where clause\
        Integer counter = 0;
        ArrayList<Pair<String, String>> const_string = new ArrayList<>();
        for(Map.Entry<Pair<String, String>, Integer> const_elem: join_constant_map.entrySet()){
            Integer const_index = const_elem.getValue();
            if(const_index.equals(group1)){
                counter++;
                const_string.add(const_elem.getKey());
            }
        }
        if(counter > 0){
            left_res += "where ";
            for(int i = 0; i < const_string.size(); i++){
                left_res += const_string.get(i).getKey();
                left_res += " eq ";
                left_res += const_string.get(i).getValue();
                if(i < const_string.size() - 1){
                    left_res += " and ";
                }
            }
            left_res += "\n";
        }


        // then return clause
        left_res += "return <tuple>\n";
        for(int i = 0; i < group1_string.size(); i++){
            left_res += format_return(group1_string.get(i));
        }
        left_res += "</tuple>,\n";

        // return the value
        return left_res;
    }

    public String format_return(String s){
        if(s.startsWith("$")){
            s = s.substring(1);
        }
        String res = "";
        res += "<";
        res += s;
        res += ">{$";
        res += s;
        res += "}</";
        res += s;
        res += ">,\n";
        return res;
    }




}
