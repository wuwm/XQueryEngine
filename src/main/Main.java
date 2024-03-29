package main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import xmlparser.XMLWriter;
import xpath.autogenerate.XPathLexer;
import xpath.autogenerate.XPathParser;
import xpath.error.ErrorListener;
import xpath.impl.XPathVisitor_232;
import xquery.autogenerate.XQueryLexer;
import xquery.autogenerate.XQueryParser;
import xquery.impl.XQueryVisitor_232;

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

        XQueryLexer lexer = new XQueryLexer(input);
        XQueryParser parser = new XQueryParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());
        XQueryVisitor_232 visitor = new XQueryVisitor_232();

        LinkedList res = visitor.visit(parser.xq());
        XMLWriter writer = XMLWriter.getInstance();
        writer.output(res);
    }
}
