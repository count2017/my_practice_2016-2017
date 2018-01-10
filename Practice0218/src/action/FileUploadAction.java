package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport{
	private String author;
	private File upload;
	private String message;
	private String uploadFileName;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	public String fileUpload(){
		try {
			FileInputStream fis = new FileInputStream(upload);
			String path = "F:/uploads/" + uploadFileName;
			FileOutputStream fos = new FileOutputStream(path);
			int data = fis.read();
			while(data != -1){
				fos.write(data);
				data = fis.read();
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		message = "恭喜【" + author + "】上传成功";
		return "upload";
	}
	
	
}
