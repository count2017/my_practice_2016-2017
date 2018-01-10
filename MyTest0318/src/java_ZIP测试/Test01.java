package java_ZIP测试;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Test01 {
	public static void main(String[] args) {
		final int BUFFER = 2048;
		ZipFile zipFile = null;
		InputStream inputStream = null;
		BufferedOutputStream dest = null;
		try {
			zipFile = new ZipFile("E:\\test.zip");
			ZipEntry zipEntry = zipFile.getEntry("test.txt");
			System.out.println("Extracting: " +zipEntry);
			//------------
			FileInputStream fis = new 
					   FileInputStream(args[0]);
				         ZipInputStream zis = new 
					   ZipInputStream(new BufferedInputStream(fis));
			int count;
            byte data[] = new byte[BUFFER];
			 FileOutputStream fos = new 
				      FileOutputStream(zipEntry.getName());
			            dest = new 
			              BufferedOutputStream(fos, BUFFER);
			            while ((count = zis.read(data, 0, BUFFER)) 
			              != -1) {
			               dest.write(data, 0, count);
			            }
			            dest.flush();
			            dest.close();
			            inputStream.close();
						zipFile.close();
			
			//-----------
			inputStream = zipFile.getInputStream(zipEntry);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
	}
}

