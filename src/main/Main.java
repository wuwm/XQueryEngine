package main;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import xmlparser.XMLWriter;
import xpath.autogenerate.*;
import xpath.impl.XPathVisitor_232;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        CharStream input = null;
        try {
            input = CharStreams.fromFileName("input.txt");
//            input = CharStreams.fromString("doc(\"j_caesar.xml\")/PLAY");//, 1);
        }catch (Exception e){
            e.printStackTrace();
        }

        XPathLexer lexer = new XPathLexer(input);
        XPathParser parser = new XPathParser(new CommonTokenStream(lexer));
        XPathVisitor_232 visitor = new XPathVisitor_232();

        LinkedList res = visitor.visit(parser.ap());
        XMLWriter writer = new XMLWriter();
        writer.output(res);
    }
}
