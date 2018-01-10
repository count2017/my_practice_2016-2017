package Test111601;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {

	public static void main(String[] args) {
		File file = new File("E:\\demo\\sky.txt");
		FileReader fr = null;
		BufferedReader bfr = null;
		
		try {
			fr = new FileReader(file);
			bfr = new BufferedReader(fr);
//			char[] c = new char[2048];
			String date = bfr.readLine();
			while(date != null){
//				String str = new String(c);
				System.out.println(date);
				date = bfr.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
				bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
