package Test111601;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		File file = new File("E:\\demo\\sky.txt");
		FileInputStream fis =null;
		BufferedInputStream bis =null;
		try {
			fis = new FileInputStream(file);
			 bis = new BufferedInputStream(fis);
			byte[] b = new byte[1024];
			int date = bis.read(b);
			if(date != -1){
				String str = new String(b,0,date);
				System.out.print(str);
				date = bis.read(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
