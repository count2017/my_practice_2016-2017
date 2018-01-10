package Test1204;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Io2 {
	public static void main(String[] args) {
		File file = new File("d:/blue.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		OutputStreamWriter osb = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream(file,true);
			osb = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osb);
			  while(true){
			    	String s = sc.next();
			    	char[] c = s.toCharArray();
			    	if(!s.equals("exit")){
			    		try {
							bw.write(c, 0, c.length);
							bw.flush();
						} catch (IOException e) {
							e.printStackTrace();
						}
			    	}else{
			    		break;
			    	}
			    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			sc.close();
			try {
				fos.close();
				osb.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
