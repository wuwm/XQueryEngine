package xmlparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.LinkedList;

public class XMLWriter {
    private Document document;

    public void output(LinkedList res) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;

        try {
            builder = factory.newDocumentBuilder();
        }catch (Exception e){
            e.printStackTrace();
        }
        this.document = builder.newDocument();
        Element root = this.document.createElement("Results");
        this.document.appendChild(root);


        if (res != null && res.size() != 0 && res.get(0) instanceof String) {
            LinkedList<String> res2 = (LinkedList<String>) res;
            for (String s : res2) {
                System.out.println(s);
            }
        } else if (res != null && res.size() != 0 && res.get(0) instanceof Node) {
            LinkedList<Node> list = (LinkedList<Node>) res;
            if(list.get(0).getNodeType() == Node.TEXT_NODE){
                for (Node n : list) {
                    System.out.println(n.getNodeValue());
                }
            }else{
                try {
                    for (int i = 0; i < list.size(); i++) {
                        Node cur = list.get(i);
                        Node newChild = cur.cloneNode(true);
                        root.appendChild(this.document.importNode(cur, true));
                    }

                    TransformerFactory factory2 = TransformerFactory.newInstance();
                    Transformer former = factory2.newTransformer();
                    former.setOutputProperty(OutputKeys.INDENT, "yes");
                    former.transform(new DOMSource(this.document), new StreamResult(new File("out.xml")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } else if(res.size() == 0) {
            try {
                TransformerFactory factory2 = TransformerFactory.newInstance();
                Transformer former = factory2.newTransformer();
                former.setOutputProperty(OutputKeys.INDENT, "yes");
                former.transform(new DOMSource(this.document), new StreamResult(new File("out.xml")));
            } catch (Exception e){
                e.printStackTrace();
            }
        }else {
            System.out.println("Error! Filter cannot be the output.");
        }

    }
}
