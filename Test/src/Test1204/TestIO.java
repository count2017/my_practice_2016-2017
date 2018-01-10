package Test1204;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestIO {
	public static void main(String[] args) {
		File file1 = new File("d:/demo.txt");
		Scanner iso = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		String _s = null;
//		if(file1.exists()){
//			boolean b = file1.delete();
//			System.out.println(b);
//		}
		try {
			fw = new FileWriter(file1);
		    bw = new BufferedWriter(fw);
			while(true){
				String s = iso.next();
				if(!s.equals("exit")){
					 _s = _s + s;
					char[] c = _s.toCharArray();
					bw.write(c, 0, c.length);
				}else{
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				iso.close();
				bw.close();
				fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
