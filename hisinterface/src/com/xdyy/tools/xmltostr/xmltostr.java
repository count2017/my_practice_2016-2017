package com.xdyy.tools.xmltostr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


public class xmltostr {
	
	   public String xmltos(String urlstr)throws Exception{  
	       
	        SAXReader reader = new SAXReader(); 	       
	        Document document = reader.read(new File(urlstr)); 	        
	        String documentStr = document.asXML(); 
	        System.out.println(documentStr);
	        return documentStr;
	    }
	   
	   public void stoxml(String xmlstr,String urlstr)throws Exception{  
	        Document document = DocumentHelper.parseText(xmlstr); 	       
	        writerDocumentToNewFile(document,urlstr);  
	    }
	   
	   public static void writerDocumentToNewFile(Document document,String address) throws Exception {
		
		 OutputFormat format = OutputFormat.createPrettyPrint();		
		 XMLWriter writer = new XMLWriter(
		 new OutputStreamWriter(new FileOutputStream(new File(address)),"UTF-8"),format);
		 writer.write(document);
		 writer.close();
		 }
}
