package com.epam.cdp.Module_5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class DOMParserDemo {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File input = new File("/Users/mac/Desktop/newFolder/test.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(input);

        System.out.println("Root element " + doc.getDocumentElement().getNodeName());


        NodeList children = doc.getElementsByTagName("book");
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            System.out.println(node.getNodeName());

            if (node.getNodeType()==Node.ELEMENT_NODE){
                Element elem = (Element) node;
                System.out.println("Book id " + elem.getAttribute("id"));
                System.out.println("author " + elem.getElementsByTagName("author").item(0).getTextContent());
            }
            
        }











     /*   SAXParserFactory factory =  SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(input, new BookHandler());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
