package action;

import java.io.File;

public class ManyFileUploadAction {
	private File[] uploadMany;
	private String author;
	private String message;
	private String[] uploadManyFileName;
	private String[] uploadManyContentType;
	
	public File[] getUploadMany() {
		return uploadMany;
	}
	public void setUploadMany(File[] uploadMany) {
		this.uploadMany = uploadMany;
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
	public String[] getUploadManyFileName() {
		return uploadManyFileName;
	}
	public void setUploadManyFileName(String[] uploadManyFileName) {
		this.uploadManyFileName = uploadManyFileName;
	}
	public String[] getUploadManyContentType() {
		return uploadManyContentType;
	}
	public void setUploadManyContentType(String[] uploadManyContentType) {
		this.uploadManyContentType = uploadManyContentType;
	}
	
	public String ManyFileUpload(){
		String path = "F:/uploads2/";
		if(uploadMany != null){
//			for (File file : uploadMany) {
//				file.renameTo(new File(path,file.getName()));
//				message = author+":批量上传成功";
//			}
			for (int i = 0; i < uploadMany.length; i++) {
				uploadMany[i].renameTo(new File(path,uploadManyFileName[i]));
				message = author+":批量上传成功";
			}
			return "success";
		}
		message = author+":批量上传失败";
		return "fail";
	}
}
