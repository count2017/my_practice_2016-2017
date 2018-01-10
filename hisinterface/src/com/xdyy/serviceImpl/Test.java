package com.xdyy.serviceImpl;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;






public class Test {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args)  throws Exception  {
		
		StringBuffer str=new StringBuffer();
		
		str.append("<?xml version=\"1.0\" encoding=\"gb2312\"?>");	
		str.append("<MSG>");
		str.append("<MSH>");
		str.append("<ORG_CODE>00078</ORG_CODE>");
		str.append("<InCODE>M01000</InCODE>");
		str.append("<BaseFun>GetDoctorArrangement</BaseFun>");
		str.append("</MSH>");
		str.append("<ASK>");
		str.append("<PAR>");		
		str.append("<CKSBM></CKSBM>");
		str.append("<DPBRQ></DPBRQ>");
		str.append("<DJSSJ></DJSSJ>");
		str.append("<IYSBM></IYSBM>");
		str.append("<ITZBJ></ITZBJ>");
		str.append("</PAR>"); 
		str.append("</ASK>");
		str.append("</MSG>");
		
		//Endpoint.publish("http://localhost:9090/interfacehis/service/WebServiceInterfaceImpl?wsdl", new WebServiceInterfaceImpl());
		
		new WebServiceInterfaceImpl().funcResult(str.toString());

	}
	
	
}		
