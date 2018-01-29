package xpath.impl;


import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class XPathTool {
    private static XPathTool instance = null;

    protected XPathTool() {
        // Exists only to defeat instantiation.
    }

    public static XPathTool getInstance() {
        if(instance == null) {
            instance = new XPathTool();
        }
        return instance;
    }

    public LinkedList<Node> findNextChildren(Node startNode){
        LinkedList<Node> res = new LinkedList<>();
        NodeList children = startNode.getChildNodes();
        for(int i = 0; i < children.getLength(); i++){
            if (children.item(i).getNodeType() == Node.ELEMENT_NODE)
                res.add(children.item(i));
        }
        return res;
    }

    public LinkedList<Node> findNextChildren(List<Node> startNodeList){
        LinkedList<Node> res = new LinkedList<>();
        for(Node node : startNodeList){
            NodeList children = node.getChildNodes();
            for(int i = 0; i < children.getLength(); i++){
                if (children.item(i).getNodeType() == Node.ELEMENT_NODE)
                    res.add(children.item(i));
            }
        }
        return res;
    }

    public LinkedList<Node> findNextChildrenWithTextElement(List<Node> startNodeList){
        LinkedList<Node> res = new LinkedList<>();
        for(Node node : startNodeList){
            NodeList children = node.getChildNodes();
            for(int i = 0; i < children.getLength(); i++){
                res.add(children.item(i));
            }
        }
        return res;
    }

//    public LinkedList<Node> findAllChildren(Node startNode){
//        LinkedList<Node> res = new LinkedList<>();
//        NodeList children = startNode.getChildNodes();
//
//        res.add(startNode);
//        if(children.getLength() == 0){
//            return res;
//        }
//        for(int i = 0; i < children.getLength(); i++){
//
//            res.addAll(findAllChildren(children.item(i)));
//        }
//        return res;
//    }

    public LinkedList<Node> findAllChildren(List<Node> startNodeList){
        LinkedHashSet<Node> res = new LinkedHashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.addAll(this.findNextChildren(startNodeList));
        while(!(queue.isEmpty())){
            Node n = queue.remove();
            if (n.getNodeType() == Node.ELEMENT_NODE)
                res.add(n);
            queue.addAll(this.findNextChildren(n));
        }
        LinkedList<Node> res2 = new LinkedList<>(res);
        return res2;
    }

    public Node findParent(Node startNode){
        return startNode.getParentNode();
    }

    public LinkedList<Node> findParents(List<Node> startNodeList){
        LinkedHashSet<Node> res = new LinkedHashSet<>();
        for(Node n : startNodeList){
            if (findParent(n).getNodeType() == Node.ELEMENT_NODE)
                res.add(findParent(n));
        }
        return new LinkedList<Node>(res);
    }

    public LinkedList<Node> findNodesByTagName(List<Node> nodeList, String tagNametoFind){
        LinkedList<Node> allChildren = findAllChildren(nodeList);
        LinkedList<Node> res = new LinkedList<>();
        for(Node n : allChildren){
            if(n.getNodeType() != Node.ELEMENT_NODE)
                continue;;
            // TODO: 1/27/18 这里是否需要加这个限制？
            if(n.getNodeName().equals(tagNametoFind))
                res.add(n);
        }
        return res;
    }

    public LinkedList<Node> findNextNodesByTagName(List<Node> nodeList, String tagNametoFind){
        LinkedList<Node> allChildren = findNextChildren(nodeList);
        LinkedList<Node> res = new LinkedList<>();
        for(Node n : allChildren){
            if(n.getNodeType() != Node.ELEMENT_NODE)
                continue;;
            // TODO: 1/27/18 这里是否需要加这个限制？
            if(n.getNodeName().equals(tagNametoFind))
                res.add(n);
        }
        return res;
    }

    public LinkedList<Node> findNodesByAttribute(List<Node> nodeList, String attributetoFind){
        LinkedList<Node> allChildren = findAllChildren(nodeList);
        LinkedList<Node> res = new LinkedList<>();
        for(Node n : allChildren){
            if(n.getNodeType() == Node.ELEMENT_NODE)
                if(!((Element) n).getAttribute(attributetoFind).equals(""))
                    res.add(n);

        }
        return res;
    }
}
