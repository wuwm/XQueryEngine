package xpath.impl;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.LinkedList;
import java.util.List;

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
    public List<Node> findNextChildren(Node startNode){
        List<Node> res = new LinkedList<>();
        NodeList children = startNode.getChildNodes();
        for(int i = 0; i < children.getLength(); i++){
            res.add(children.item(i));
        }
        return res;
    }

    public List<Node> findNextChildren(List<Node> startNodeList){
        List<Node> res = new LinkedList<>();
        for(Node node : startNodeList){
            NodeList children = node.getChildNodes();
            for(int i = 0; i < children.getLength(); i++){
                res.add(children.item(i));
            }
        }
        return res;
    }

    public List<Node> findAllChildren(Node startNode){
        List<Node> res = new LinkedList<>();
        NodeList children = startNode.getChildNodes();
        res.add(startNode);
        if(children.getLength() == 0){
            return res;
        }
        for(int i = 0; i < children.getLength(); i++){
            res.addAll(findAllChildren(children.item(i)));
        }
        return res;
    }
    public List<Node> findAllChildren(List<Node> startNodeList){
        List<Node> res = new LinkedList<>();
        for(Node n : startNodeList){
            res.addAll(findAllChildren(n));
        }
        return res;
    }

    public Node findParent(Node startNode){
        return startNode.getParentNode();
    }
    public List<Node> findParents(List<Node> startNodeList){
        List<Node> res = new LinkedList<>();
        for(Node n : startNodeList){
            res.add(findParent(n));
        }
        return res;
    }
}
