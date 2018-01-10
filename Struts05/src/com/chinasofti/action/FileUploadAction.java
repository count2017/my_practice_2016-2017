package com.chinasofti.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport{
	private String author;
	private File upload;
	private String message;
	private String uploadFileName;//��װname=upload���ļ����Ӧ���ļ���
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public File getUpload() {
		return upload;
	}
	
	
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	
   public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
public String fileUpload(){
	   //�������������ڶ�ȡStruts2�ϴ�����ļ�
	   try {
		FileInputStream fis = new FileInputStream(upload);
		   //ָ���ϴ���·��
		   String path = "F:/uploads/"+uploadFileName;
		   //��������������ϴ����ļ�д�뵽������ָ����λ��
		   FileOutputStream fos = new FileOutputStream(path);
		   //ÿ�ζ�һ���ֽڣ�data����-1��ʱ���֤���Ѿ������ļ���ĩβ
		   int data = fis.read();
		   while(data!=-1){
			   fos.write(data);
			   data = fis.read();
		   }
		   fis.close();
		   fos.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	   message = "��ϲ��"+author+"���ϴ��ɹ�";
	   return "upload";
   }
	
public String ManyFileUpload(){
	   //�������������ڶ�ȡStruts2�ϴ�����ļ�
	   try {
		FileInputStream fis = new FileInputStream(upload);
		   //ָ���ϴ���·��
		   String path = "F:/uploads/"+uploadFileName;
		   //��������������ϴ����ļ�д�뵽������ָ����λ��
		   FileOutputStream fos = new FileOutputStream(path);
		   //ÿ�ζ�һ���ֽڣ�data����-1��ʱ���֤���Ѿ������ļ���ĩβ
		   int data = fis.read();
		   while(data!=-1){
			   fos.write(data);
			   data = fis.read();
		   }
		   fis.close();
		   fos.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	   message = "��ϲ��"+author+"���ϴ��ɹ�";
	   return "upload";
}
	


}
