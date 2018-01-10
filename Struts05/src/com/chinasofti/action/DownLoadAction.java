package com.chinasofti.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport{
	private String ContentType;//�ļ�������
	private String fileName;//�����������������ļ���
	private InputStream inputStream;//����������ļ���������
	
	public String execute(){
		switch (fileName) {
		case "�ʼ�.txt":
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
