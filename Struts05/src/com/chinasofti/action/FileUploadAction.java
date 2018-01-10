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
	private String uploadFileName;//封装name=upload的文件域对应的文件名
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
	   //创建输入流用于读取Struts2上传后的文件
	   try {
		FileInputStream fis = new FileInputStream(upload);
		   //指定上传的路径
		   String path = "F:/uploads/"+uploadFileName;
		   //创建输出流，将上传的文件写入到服务器指定的位置
		   FileOutputStream fos = new FileOutputStream(path);
		   //每次读一个字节，data等于-1的时候就证明已经读到文件的末尾
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
	   message = "恭喜【"+author+"】上传成功";
	   return "upload";
   }
	
public String ManyFileUpload(){
	   //创建输入流用于读取Struts2上传后的文件
	   try {
		FileInputStream fis = new FileInputStream(upload);
		   //指定上传的路径
		   String path = "F:/uploads/"+uploadFileName;
		   //创建输出流，将上传的文件写入到服务器指定的位置
		   FileOutputStream fos = new FileOutputStream(path);
		   //每次读一个字节，data等于-1的时候就证明已经读到文件的末尾
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
	   message = "恭喜【"+author+"】上传成功";
	   return "upload";
}
	


}
