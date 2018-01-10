package Test111601;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestBufferedWriter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("E:/demo/fly.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			char[] c = new char[2048];
			while(true){
				String s = sc.next();
				if(!(s.equals("exit"))){
					c = s.toCharArray();
					bw.write(c);
//					if(c.length == 2048){
						bw.flush();
//					}
				}else{
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
