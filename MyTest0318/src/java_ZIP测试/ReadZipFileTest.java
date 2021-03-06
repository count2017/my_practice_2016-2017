package java_ZIP测试;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class ReadZipFileTest {
	public static void main(String[] args) {
		try {
			readZipFile("E:\\test.zip");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readZipFile(String file) throws Exception{
		ZipFile zf = new ZipFile(file);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ZipInputStream zin = new ZipInputStream(in);
		ZipEntry ze;
		while((ze=zin.getNextEntry()) != null){
			if(ze.isDirectory()){
				
			}else{
				System.err.println("file-"+ze.getName()+":"+ze.getSize()+"bytes");
				Long size = ze.getSize();
				if(size > 0){
					BufferedReader br = new BufferedReader(new InputStreamReader(zf.getInputStream(ze)));
					String line;
					while((line=br.readLine())!=null){
						System.out.println(line);
//						System.err.println(line);
					}
					br.close();
				}
				System.out.println();
			}
		}
		zin.closeEntry();
	}
}
