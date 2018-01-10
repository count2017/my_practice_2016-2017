package com.xdyy.tools.xmltostr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



 
public class XmlImpl implements XmlInterface{   
 
	
    public Map<String, String> parserXml(String fileName) {
    	Map<String, String> map=new HashMap<String, String>();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(fileName);
             
            NodeList employees = document.getChildNodes();
            for (int i = 0; i < employees.getLength(); i++) {
                Node employee = employees.item(i);
                NodeList employeeInfo = employee.getChildNodes();
                for (int j = 0; j < employeeInfo.getLength(); j++) {
                    Node node = employeeInfo.item(j);
                    NodeList employeeMeta = node.getChildNodes();
                    for (int k = 0; k < employeeMeta.getLength(); k++) {
                    	if(employeeMeta.item(k).getTextContent().equals("")){                    		
                    	}else{
                    		if(employeeMeta.item(k).getNodeName().equals("PAR")){
                    			NodeList nodelist=employeeMeta.item(k).getChildNodes();
                    			for (int y=0;y<nodelist.getLength();y++){
                    				if(nodelist.item(y).getTextContent().equals("")){
                    				}else{
                    					map.put(nodelist.item(y).getNodeName(), nodelist.item(y).getTextContent());
                    				}
                    			}
                    		}
                    		map.put(employeeMeta.item(k).getNodeName(), employeeMeta.item(k).getTextContent());
                       }
                    }
                }
            }
            
        } catch (FileNotFoundException e) {
        	System.out.println(e.getMessage());
        } catch (ParserConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (SAXException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		return map;
       
    }



    
   
}