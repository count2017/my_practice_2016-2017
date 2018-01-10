package com.xdyy.tools.xmltostr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class CreateXml {

	private Document document;


	public void createXMLinit(ResultSet rs) {
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			this.document = builder.newDocument();
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		}
		createXMLfile(rs);
	}
 

	/* 创建XML生成方法 */
	public void createXMLfile(ResultSet rs) {

		Element root = this.document.createElement("Response");
		this.document.appendChild(root);
		Element employee = this.document.createElement("TransCode");
		Element employee1 = this.document.createElement("ResultCode");
		
		Element czyh = this.document.createElement("ZYH");
		czyh.appendChild(this.document.createTextNode("222"));
		employee.appendChild(czyh);
		
		root.appendChild(employee);
		root.appendChild(employee1);

		TransformerFactory tf = TransformerFactory.newInstance();
		try {
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(document);
			transformer.setOutputProperty(OutputKeys.ENCODING, "GBK");
			transformer.setOutputProperty(OutputKeys.INDENT, "YES");
			transformer.setOutputProperty(OutputKeys.STANDALONE, "TRUE");
			PrintWriter pw = new PrintWriter(new FileOutputStream("C:/TPATHSJ/123321.XML"));
			StreamResult result = new StreamResult(pw);
			transformer.transform(source, result);
		} catch (TransformerConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (TransformerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}


}
