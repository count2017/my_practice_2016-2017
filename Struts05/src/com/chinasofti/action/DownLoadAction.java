package com.chinasofti.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport{
	private String ContentType;//文件的类型
	private String fileName;//存放下载来自请求的文件名
	private InputStream inputStream;//返回请求的文件产生的流
	
	public String execute(){
		switch (fileName) {
		case "笔记.txt":
			ContentType = "text/plain";
			break;
		case "qq.png":
			ContentType = "image/png";
			break;
		case "weixin.png":
			ContentType = "image/png";
			break;
		default:
			break;
		}
		try {
			inputStream = new FileInputStream("F:/uploads/"+fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
	public String getContentType() {
		return ContentType;
	}
	public void setContentType(String contentType) {
		ContentType = contentType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	

}
