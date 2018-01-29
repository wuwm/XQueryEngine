package main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import xmlparser.XMLWriter;
import xpath.autogenerate.XPathLexer;
import xpath.autogenerate.XPathParser;
import xpath.impl.XPathVisitor_232;

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
