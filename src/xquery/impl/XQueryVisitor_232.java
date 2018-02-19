package xquery.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import xmlparser.XMLParser;
import xquery.autogenerate.XQueryParser;
import xpath.impl.XPathTool;
import xquery.autogenerate.XQueryBaseVisitor;
import xquery.autogenerate.XQueryParser;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class XQueryVisitor_232 extends XQueryBaseVisitor<LinkedList> {

    private HashMap<String, LinkedList<Node>> context = new HashMap<>();
    private LinkedList<Node> curNodes = new LinkedList<>();
    private Document docc = null;

    @Override
    public LinkedList visitSingle_ap(XQueryParser.Single_apContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        LinkedList<Node> res = new LinkedList<>();
        XMLParser xml = new XMLParser(ctx.filename().getText());
        this.curNodes.add(xml.getDoc());
        this.docc = xml.getDoc();
        res = this.visit(ctx.rp());
        this.curNodes = new LinkedList<>(res);
        return res;
    }

    @Override
    public LinkedList visitDouble_ap(XQueryParser.Double_apContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        XMLParser xml = new XMLParser(ctx.filename().getText());
        this.docc = xml.getDoc();
        curNodes.add(xml.getDoc());
        curNodes.addAll(xpathTool.findAllChildren(curNodes));
        LinkedList<Node> res = new LinkedList<>(this.visit(ctx.rp()));
        this.curNodes = res;
        return res;
    }

    @Override
    public LinkedList visitAttname_rp(XQueryParser.Attname_rpContext ctx) {
//        LinkedList<Node> res = new LinkedList<>();
//        XPathTool xpathTool = XPathTool.getInstance();
//        res = xpathTool.findNodesByAttribute(curNodes, ctx.attName().getText());
//        this.curNodes = res;
//        return res;
        LinkedList<Node> res = new LinkedList<>();
        // TODO: 1/27/18 这里进行了类型转换，返回的不再是一个Node的List，而是一个String的List
        LinkedList<Node> nextChildren = new LinkedList<>();
        XPathTool xpathTool = XPathTool.getInstance();
        for (Node n : this.curNodes){
            if(n.getNodeType() == Node.ELEMENT_NODE){
                Element e = (Element) n;
                String attr = e.getAttribute(ctx.attName().getText());
                if(!attr.equals("")){
                    Node new_n = this.docc.createTextNode(attr);
                    res.add(new_n);
                }
            }else{
                // TODO: 1/28/18 这里需要报错
            }
        }
        return res;
    }

    @Override
    public LinkedList visitSingle_prs(XQueryParser.Single_prsContext ctx) {
        this.visit(ctx.rp(0));
        LinkedHashSet<Node> res_temp = new LinkedHashSet<>(this.visit(ctx.rp(1)));
        LinkedList<Node> res = new LinkedList<>(res_temp);
        this.curNodes = res;
        return res;
    }

    @Override
    public LinkedList visitDouble_prs(XQueryParser.Double_prsContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        // TODO: 1/27/18 这里是=还是addall，有点不确定
        this.visit(ctx.rp(0));
        this.curNodes.addAll(xpathTool.findAllChildren(curNodes));
        this.curNodes = new LinkedList<Node>(this.visit(ctx.rp(1)));
        return this.curNodes;
        // TODO: 1/27/18 按照要求这里需要进行unique(）操作，实际上我没做
    }

    @Override
    public LinkedList visitFilter_rp(XQueryParser.Filter_rpContext ctx) {

        assert this.visit(ctx.f()).size() == 1;
        assert this.visit(ctx.f()).get(0) instanceof Boolean;
        LinkedList<Node> res = new LinkedList<>();
        this.visit(ctx.rp());
        LinkedList<Node> curNodes_bak = new LinkedList<>(this.curNodes);
        for (Node n : curNodes_bak){
            LinkedList<Node> curNodes_new = new LinkedList<>();
            curNodes_new.add(n);
            this.curNodes = curNodes_new;
            LinkedList<Boolean> filterRet = this.visit(ctx.f());
            assert filterRet.size() == 1;
            assert filterRet.get(0) instanceof Boolean;
            Boolean filterValue = filterRet.get(0);
            if (filterValue){
                res.add(n);
            }
        }
        this.curNodes = res;
        return res;
    }



    @Override
    public LinkedList visitParent_rp(XQueryParser.Parent_rpContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        this.curNodes = xpathTool.findParents(curNodes);
        return this.curNodes;
    }

    @Override
    public LinkedList visitSelf_rp(XQueryParser.Self_rpContext ctx) {
        return this.curNodes;
    }

    @Override
    public LinkedList visitBrace_rp(XQueryParser.Brace_rpContext ctx) {
        return this.visit(ctx.rp());
    }

    @Override
    public LinkedList visitTagname_rp(XQueryParser.Tagname_rpContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        String tagNametoFind = ctx.getText();
        LinkedList<Node> res = xpathTool.findNextNodesByTagName(curNodes, tagNametoFind);
        //Already make sure the nodes are ELEMENT type
        this.curNodes = res;
        return curNodes;
    }

    @Override
    public LinkedList visitChild_rp(XQueryParser.Child_rpContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        this.curNodes = xpathTool.findNextChildren(curNodes);
        //Already make sure the nodes are ELEMENT type
        return this.curNodes;
    }

    @Override
    public LinkedList visitValue_rp(XQueryParser.Value_rpContext ctx) {
        LinkedList<Node> res = new LinkedList<>();
        // TODO: 1/27/18 这里进行了类型转换，返回的不再是一个Node的List，而是一个String的List
        LinkedList<Node> nextChildren = new LinkedList<>();
        XPathTool xpathTool = XPathTool.getInstance();
        nextChildren = xpathTool.findNextChildrenWithTextElement(curNodes);
        for (Node n : nextChildren){
            if(n.getNodeType() == Node.TEXT_NODE){
                // TODO: 1/27/18 有没有其它不需要输出的情况？
                res.add(n);
            }else{
                // TODO: 1/28/18 这里需要报错
            }
        }
        return res;
    }

    @Override
    public LinkedList visitComma_rps(XQueryParser.Comma_rpsContext ctx) {
        LinkedList<Node> curNode_bak = new LinkedList<Node>(this.curNodes);
        LinkedHashSet<Node> res_NODUP = new LinkedHashSet<>();
        LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> left_res = this.visit(ctx.rp(0));
        this.curNodes = curNode_bak;
        // TODO: 1/27/18 这里是否需要恢复curNodes？
        LinkedList<Node> right_res = this.visit(ctx.rp(1));
        res_NODUP.addAll(left_res);
        res_NODUP.addAll(right_res);
        //Remove duplicates
        res = new LinkedList<>(res_NODUP);
        this.curNodes = res;
        return res;
    }

    @Override
    public LinkedList visitRp_f(XQueryParser.Rp_fContext ctx) {
//        LinkedList<Node> curNode_bak = (LinkedList<Node>) this.curNodes.clone();
//        LinkedList<Node> res = new LinkedList<>();
//        for(Node n : curNode_bak){
//            this.curNodes = new LinkedList<Node>();
//            this.curNodes.add(n);
//            if(this.visit(ctx.rp()).size() > 0)
//                res.add(n);
//            this.curNodes = curNode_bak;
//        }
//        this.curNodes = res;
//        return res;
        LinkedList<Boolean> res = new LinkedList<>();
        LinkedList<Node> curNodes_bak = new LinkedList<>(this.curNodes);
        if(this.visit(ctx.rp()).size() > 0){
            res.add(Boolean.TRUE);
        }else{
            res.add(Boolean.FALSE);
        }
        this.curNodes = curNodes_bak;
        return res;
    }

    @Override
    public LinkedList visitAnd_fs(XQueryParser.And_fsContext ctx) {
        LinkedList<Node> curNode_bak = new LinkedList<>(this.curNodes);
        Boolean left_res = ((LinkedList<Boolean>)this.visit(ctx.f(0))).get(0);
        // TODO: 1/27/18 这里要加assert
        this.curNodes = curNode_bak;
        Boolean right_res = ((LinkedList<Boolean>)this.visit(ctx.f(1))).get(0);
        LinkedList<Boolean> res = new LinkedList<>();
        res.add(left_res && right_res);
        return res;
    }

    @Override
    public LinkedList visitNot_f(XQueryParser.Not_fContext ctx) {
        Boolean left_res = ((LinkedList<Boolean>)this.visit(ctx.f())).get(0);
        // TODO: 1/27/18 这里要加assert
        LinkedList<Boolean> res = new LinkedList<>();
        res.add( !left_res );
        return res;
    }

    @Override
    public LinkedList visitOr_fs(XQueryParser.Or_fsContext ctx) {
        LinkedList<Node> curNode_bak = new LinkedList<>(this.curNodes);
        Boolean left_res = ((LinkedList<Boolean>)this.visit(ctx.f(0))).get(0);
        // TODO: 1/27/18 这里要加assert
        this.curNodes = curNode_bak;
        Boolean right_res = ((LinkedList<Boolean>)this.visit(ctx.f(1))).get(0);
        LinkedList<Boolean> res = new LinkedList<>();
        res.add(left_res || right_res);
        return res;
    }

    @Override
    public LinkedList visitBrace_f(XQueryParser.Brace_fContext ctx) {
        return this.visit(ctx.f());
    }

    @Override
    public LinkedList visitRps_veq_f(XQueryParser.Rps_veq_fContext ctx) {
        LinkedList<Node> curNodes_bak = new LinkedList<>(this.curNodes);
        LinkedList<Node> left_res = (LinkedList<Node>)this.visit(ctx.rp(0));
        this.curNodes = curNodes_bak;
        LinkedList<Node> right_res = (LinkedList<Node>)this.visit(ctx.rp(1));
        this.curNodes = curNodes_bak;
        LinkedList<Boolean> res = new LinkedList<>();
        Boolean flag = false;
        for(Node n1 : left_res){
            for(Node n2 : right_res){
                if(n1.isEqualNode(n2)){
                    flag = true;
                    break;
                }
            }
        }
        res.add(flag);
        return res;
    }

    @Override
    public LinkedList visitRps_ieq_f(XQueryParser.Rps_ieq_fContext ctx) {
        LinkedList<Node> curNodes_bak = new LinkedList<>(this.curNodes);
        LinkedList<Node> left_res = (LinkedList<Node>)this.visit(ctx.rp(0));
        this.curNodes = curNodes_bak;
        LinkedList<Node> right_res = (LinkedList<Node>)this.visit(ctx.rp(1));
        this.curNodes = curNodes_bak;
        LinkedList<Boolean> res = new LinkedList<>();
        Boolean flag = false;
        for(Node n1 : left_res){
            for(Node n2 : right_res){
                if(n1 == n2){
                    // TODO: 1/28/18 这里直接用==的方法不知道对不对
                    flag = true;
                    break;
                }
            }
        }
        res.add(flag);
        return res;
    }

    // TODO: 1/27/18 下面的应该不用写，因为上面直接用getText()取得需要的String 
    @Override
    public LinkedList visitTagName(XQueryParser.TagNameContext ctx) {
        return super.visitTagName(ctx);
    }

    @Override
    public LinkedList visitAttName(XQueryParser.AttNameContext ctx) {
        return super.visitAttName(ctx);
    }

    @Override
    public LinkedList visitFilename(XQueryParser.FilenameContext ctx) {
        return super.visitFilename(ctx);
    }


    //-----------------------------从下面开始写-------------------------------------------------------




    @Override
    public LinkedList visitXq_StringConstant(XQueryParser.Xq_StringConstantContext ctx) {
        return super.visitXq_StringConstant(ctx);
    }

    @Override
    public LinkedList visitXq_IDxqID(XQueryParser.Xq_IDxqIDContext ctx) {
        return super.visitXq_IDxqID(ctx);
    }

    @Override
    public LinkedList visitXq_xqCxq(XQueryParser.Xq_xqCxqContext ctx) {
        return super.visitXq_xqCxq(ctx);
    }

    @Override
    public LinkedList visitXq_xqSxq(XQueryParser.Xq_xqSxqContext ctx) {
        return super.visitXq_xqSxq(ctx);
    }

    @Override
    public LinkedList visitXq_xqSSxq(XQueryParser.Xq_xqSSxqContext ctx) {
        return super.visitXq_xqSSxq(ctx);
    }

    @Override
    public LinkedList visitXq_LETxq(XQueryParser.Xq_LETxqContext ctx) {
        return super.visitXq_LETxq(ctx);
    }

    @Override
    public LinkedList visitXq_ap(XQueryParser.Xq_apContext ctx) {
        return super.visitXq_ap(ctx);
    }

    @Override
    public LinkedList visitXq_var(XQueryParser.Xq_varContext ctx) {
        return super.visitXq_var(ctx);
    }

    @Override
    public LinkedList visitXq_PxqP(XQueryParser.Xq_PxqPContext ctx) {
        return super.visitXq_PxqP(ctx);
    }

    @Override
    public LinkedList visitXq_ForLetWhereReturn(XQueryParser.Xq_ForLetWhereReturnContext ctx) {
        return super.visitXq_ForLetWhereReturn(ctx);
    }

    @Override
    public LinkedList visitVar(XQueryParser.VarContext ctx) {
        return super.visitVar(ctx);
    }

    @Override
    public LinkedList visitForClause(XQueryParser.ForClauseContext ctx) {
        return super.visitForClause(ctx);
    }

    @Override
    public LinkedList visitLetClause(XQueryParser.LetClauseContext ctx) {
        return super.visitLetClause(ctx);
    }

    @Override
    public LinkedList visitWhereClause(XQueryParser.WhereClauseContext ctx) {
        return super.visitWhereClause(ctx);
    }

    @Override
    public LinkedList visitReturnClause(XQueryParser.ReturnClauseContext ctx) {
        return super.visitReturnClause(ctx);
    }

    @Override
    public LinkedList visitCond_EMPTYxq(XQueryParser.Cond_EMPTYxqContext ctx) {
        return super.visitCond_EMPTYxq(ctx);
    }

    @Override
    public LinkedList visitCond_NOTcond(XQueryParser.Cond_NOTcondContext ctx) {
        return super.visitCond_NOTcond(ctx);
    }

    @Override
    public LinkedList visitCond_xqIEQxq(XQueryParser.Cond_xqIEQxqContext ctx) {
        return super.visitCond_xqIEQxq(ctx);
    }

    @Override
    public LinkedList visitCond_xqVEQxq(XQueryParser.Cond_xqVEQxqContext ctx) {
        return super.visitCond_xqVEQxq(ctx);
    }

    @Override
    public LinkedList visitCond_PcondP(XQueryParser.Cond_PcondPContext ctx) {
        return super.visitCond_PcondP(ctx);
    }

    @Override
    public LinkedList visitCond_Some(XQueryParser.Cond_SomeContext ctx) {
        return super.visitCond_Some(ctx);
    }

    @Override
    public LinkedList visitCond_condORcond(XQueryParser.Cond_condORcondContext ctx) {
        return super.visitCond_condORcond(ctx);
    }

    @Override
    public LinkedList visitCond_condANDcond(XQueryParser.Cond_condANDcondContext ctx) {
        return super.visitCond_condANDcond(ctx);
    }
}
