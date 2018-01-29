package test.xpath.impl; 


import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import xmlparser.XMLParser;
import xpath.impl.XPathTool;

import java.util.LinkedList;

/** 
* XPathTool Tester. 
* 
* @author <Authors name> 
* @since <pre>Jan 28, 2018</pre> 
* @version 1.0 
*/ 
public class XPathToolTest { 


    XPathTool tool = XPathTool.getInstance();
    LinkedList<Node> nodeList_toTest = new LinkedList<>();
    Node node_toTest = null;
@Before
public void before() throws Exception {
    XMLParser xmlParser = new XMLParser("j_caesar.xml");
    Document doc = xmlParser.getDoc();
    NodeList l = doc.getElementsByTagName("ACT");
    System.out.println(l.getLength());
    for (int i = 0; i < 2; i++){
        this.nodeList_toTest.add(l.item(i));
    }
    this.node_toTest = this.nodeList_toTest.get(0);

} 

@After
public void after() throws Exception {

} 

/** 
* 
* Method: getInstance() 
* 
*/ 
@Test
public void testGetInstance() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findNextChildren(Node startNode) 
* 
*/ 
@Test
public void testFindNextChildrenStartNode() throws Exception { 
    LinkedList<Node> res = this.tool.findNextChildren(this.node_toTest);
    System.out.println(res.toString());
}

/** 
* 
* Method: findNextChildren(List<Node> startNodeList) 
* 
*/ 
@Test
public void testFindNextChildrenStartNodeList() throws Exception {
    LinkedList<Node> res = this.tool.findNextChildren(this.nodeList_toTest);
    System.out.println(res.toString());
} 

/** 
* 
* Method: findAllChildren(Node startNode) 
* 
*/ 
@Test
public void testFindAllChildrenStartNode() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findAllChildren(List<Node> startNodeList) 
* 
*/ 
@Test
public void testFindAllChildrenStartNodeList() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findParent(Node startNode) 
* 
*/ 
@Test
public void testFindParent() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findParents(List<Node> startNodeList) 
* 
*/ 
@Test
public void testFindParents() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findNodesByTagName(List<Node> nodeList, String tagNametoFind) 
* 
*/ 
@Test
public void testFindNodesByTagName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findNodesByAttribute(List<Node> nodeList, String attributetoFind) 
* 
*/ 
@Test
public void testFindNodesByAttribute() throws Exception { 
//TODO: Test goes here... 
} 


} 
