package Test1204;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO3 {
	public static void main(String[] args) {
		BufferedReader br = null;
		StringBuffer s = new StringBuffer();
		int sum = 0;
		try {
			br = new BufferedReader(new FileReader(new File("d:/red.txt")));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		FileWriter fw = null;
		try {
			String s1 = br.readLine();
			String[] s2 = s1.split("\\|");
			s.append(s2[0]);
			sum += Integer.parseInt(s2[0]);
			for (int i = 1; i < s2.length; i++) {
				s.append("+" + s2[i]);
				sum += Integer.parseInt(s2[i]);
			}
			while((s1 = br.readLine())!= null){
				s2 = s1.split("\\|");
				for (int i = 0; i < s2.length; i++) {
					s.append("+" + s2[i]);
					sum += Integer.parseInt(s2[i]);
				}
			}
			s.append("=" + sum);
			fw = new FileWriter(new File("d:/black.txt"));
			fw.write(s.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
