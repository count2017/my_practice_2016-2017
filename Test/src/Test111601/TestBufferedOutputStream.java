package Test111601;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestBufferedOutputStream {

	public static void main(String[] args) {
		File file = new File("E:\\demo\\sky.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		Scanner sc = new Scanner(System.in);
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			byte[] b =new byte[1024];
			while(true){
				String s = sc.next();
				if(!(s.equals("exit")) ){
					b = s.getBytes();
					bos.write(b);
					bos.flush();
				}else{
					break;
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
