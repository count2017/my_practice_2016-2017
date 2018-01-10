package com.chinasofti.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class ManyFileUploadAction extends ActionSupport{
	
	private File[] upload1;
	private String author;
	private String message;
	private String[] upload1FileName;
	private String[] upload1ContentType;
	public File[] getUpload1() {
		return upload1;
	}
	public void setUpload1(File[] upload1) {
		this.upload1 = upload1;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String[] getUpload1FileName() {
		return upload1FileName;
	}
	public void setUpload1FileName(String[] upload1FileName) {
		this.upload1FileName = upload1FileName;
	}
	public String[] getUpload1ContentType() {
		return upload1ContentType;
	}
	public void setUpload1ContentType(String[] upload1ContentType) {
		this.upload1ContentType = upload1ContentType;
	}
	
	
	public String ManyFileUpload(){
		//指定将多个文件保存的路径
		String path = "f:/uploads2/";
		if(upload1!=null){
			for (int i = 0; i < upload1.length; i++) {
				//把已经上传到临时目录中的文件，批量的另存为到其他的位置
				upload1[i].renameTo(new File(path,upload1FileName[i]));
				message = author+":批量上传成功";
			}
			return "success";
		}
		message = author+":批量上传失败";
		return "fail";
		
		
	}
	

}
