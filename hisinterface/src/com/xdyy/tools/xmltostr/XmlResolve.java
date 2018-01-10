package com.xdyy.tools.xmltostr;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XmlResolve {
	
	 public  Map<String, String> parse(String protocolXML) throws Exception {
		 DocumentBuilderFactory factory = DocumentBuilderFactory   
                 .newInstance();   
         DocumentBuilder builder = factory.newDocumentBuilder();         
         Document doc = builder   
                 .parse(new InputSource(new StringReader(protocolXML)));        
         Element root = doc.getDocumentElement();         
         NodeList books = root.getChildNodes();       
        return parsemap(books) ;  		
    
    }

	public  Map<String, String> parsemap(NodeList books){	
	 Map<String, String> map=new HashMap<String, String>();		
	 if (books != null) { 
		for(int i=0;i<books.getLength();i++){
	     		Node book=books.item(i);
	     		if(book.getChildNodes().getLength()>1){	 
	     			toolfunction(book,map);     	
	     		} /*else if(book.getChildNodes().getLength()==1){
	     			if(book.getFirstChild().getNodeName().equals("PAR")){
	     			toolfunction(book.getFirstChild(),map);}
	     		}*/
	     	}
	     }	 
	 	return map;
	}


	public  Map<String, String> toolfunction(Node book,Map<String, String> map){
	 if(book.getChildNodes().getLength()>0){
		 for(int x=0;x<book.getChildNodes().getLength();x++){
	 			Node childnode=book.getChildNodes().item(x); 
		 			if(!childnode.getNodeName().equals("#text")){
		 			
		 			if (childnode.getTextContent().equals("")){
		 			}else{
		 				map.put(childnode.getNodeName(),childnode.getTextContent());
		 			}
		 			
		 			if(childnode.getNodeName().equals("PAR")){
		 				for(int t=0;t<childnode.getChildNodes().getLength();t++){
		 					map.put(childnode.getChildNodes().item(t).getNodeName(),childnode.getChildNodes().item(t).getTextContent());
		 				}
		 			}
	 			}
	 	} 				
	}
	
	 	return map;
	}

}
