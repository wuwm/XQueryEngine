package xpath.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import xmlparser.XMLParser;
import xpath.autogenerate.XPathBaseVisitor;
import xpath.autogenerate.XPathParser;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class XPathVisitor_232 extends XPathBaseVisitor<LinkedList>{

    private LinkedList<Node> curNodes = new LinkedList<>();
    private Document docc = null;
    @Override
    public LinkedList visitSingle_ap(XPathParser.Single_apContext ctx) {
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
    public LinkedList visitDouble_ap(XPathParser.Double_apContext ctx) {
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
    public LinkedList visitAttname_rp(XPathParser.Attname_rpContext ctx) {
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
    public LinkedList visitSingle_prs(XPathParser.Single_prsContext ctx) {
        this.visit(ctx.rp(0));
        LinkedHashSet<Node> res_temp = new LinkedHashSet<>(this.visit(ctx.rp(1)));
        LinkedList<Node> res = new LinkedList<>(res_temp);
        this.curNodes = res;
        return res;
    }

    @Override
    public LinkedList visitDouble_prs(XPathParser.Double_prsContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        // TODO: 1/27/18 这里是=还是addall，有点不确定
        this.visit(ctx.rp(0));
        this.curNodes.addAll(xpathTool.findAllChildren(curNodes));
        this.curNodes = new LinkedList<Node>(this.visit(ctx.rp(1)));
        return this.curNodes;
        // TODO: 1/27/18 按照要求这里需要进行unique(）操作，实际上我没做
    }

    @Override
    public LinkedList visitFilter_rp(XPathParser.Filter_rpContext ctx) {

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
    public LinkedList visitParent_rp(XPathParser.Parent_rpContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        this.curNodes = xpathTool.findParents(curNodes);
        return this.curNodes;
    }

    @Override
    public LinkedList visitSelf_rp(XPathParser.Self_rpContext ctx) {
        return this.curNodes;
    }

    @Override
    public LinkedList visitBrace_rp(XPathParser.Brace_rpContext ctx) {
        return this.visit(ctx.rp());
    }

    @Override
    public LinkedList visitTagname_rp(XPathParser.Tagname_rpContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        String tagNametoFind = ctx.getText();
        LinkedList<Node> res = xpathTool.findNextNodesByTagName(curNodes, tagNametoFind);
        //Already make sure the nodes are ELEMENT type
        this.curNodes = res;
        return curNodes;
    }

    @Override
    public LinkedList visitChild_rp(XPathParser.Child_rpContext ctx) {
        XPathTool xpathTool = XPathTool.getInstance();
        this.curNodes = xpathTool.findNextChildren(curNodes);
        //Already make sure the nodes are ELEMENT type
        return this.curNodes;
    }

    @Override
    public LinkedList visitValue_rp(XPathParser.Value_rpContext ctx) {
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
    public LinkedList visitComma_rps(XPathParser.Comma_rpsContext ctx) {
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
    public LinkedList visitRp_f(XPathParser.Rp_fContext ctx) {
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
    public LinkedList visitAnd_fs(XPathParser.And_fsContext ctx) {
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
    public LinkedList visitNot_f(XPathParser.Not_fContext ctx) {
        Boolean left_res = ((LinkedList<Boolean>)this.visit(ctx.f())).get(0);
        // TODO: 1/27/18 这里要加assert
        LinkedList<Boolean> res = new LinkedList<>();
        res.add( !left_res );
        return res;
    }

    @Override
    public LinkedList visitOr_fs(XPathParser.Or_fsContext ctx) {
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
    public LinkedList visitBrace_f(XPathParser.Brace_fContext ctx) {
        return this.visit(ctx.f());
    }

    @Override
    public LinkedList visitRps_veq_f(XPathParser.Rps_veq_fContext ctx) {
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
    public LinkedList visitRps_ieq_f(XPathParser.Rps_ieq_fContext ctx) {
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
    public LinkedList visitTagName(XPathParser.TagNameContext ctx) {
        return super.visitTagName(ctx);
    }

    @Override
    public LinkedList visitAttName(XPathParser.AttNameContext ctx) {
        return super.visitAttName(ctx);
    }

    @Override
    public LinkedList visitFilename(XPathParser.FilenameContext ctx) {
        return super.visitFilename(ctx);
    }
}
