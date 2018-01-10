package Test1117;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestObjectIO {
	public static void main(String[] args) {
		T t = new T();
		t.k = 8;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("d:/demo.dat");
			 oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
	class T implements Serializable{
		int i = 10;
		int j = 9;
		double d = 2.3;
		transient int k = 15;
	}