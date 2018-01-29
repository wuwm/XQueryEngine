package xmlparser;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.io.InputStream;

public class XMLParser {

    private Document doc = null;
    public XMLParser(String inputFileName) {
        DocumentBuilderFactory domfac = DocumentBuilderFactory.newInstance();
        DocumentBuilder dombuilder = null;

        try{
            InputStream is= new  FileInputStream(inputFileName);
            dombuilder = domfac.newDocumentBuilder();
            if (dombuilder != null) {
                this.doc = dombuilder.parse(is);
            }
            this.doc.getDocumentElement().normalize();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Document getDoc() {
        return doc;
    }
}

