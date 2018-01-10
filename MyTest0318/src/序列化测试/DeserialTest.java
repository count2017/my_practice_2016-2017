package 序列化测试;

import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialTest {

	/**   * @param args   */ 
	public static void main(String[] args) {   // TODO Auto-generated method stub  
		Serial serial2 ; 
		try {  
			FileInputStream fis = new FileInputStream("D:/serialTest.txt");
			ObjectInputStream ois = new ObjectInputStream(fis); 
			serial2 = (Serial)ois.readObject();  
			ois.close();   
			System.out.println("Object Deserial"+serial2+"  "+"age="+serial2.age);  
		} catch (FileNotFoundException e) {    // TODO Auto-generated catch block  
			e.printStackTrace(); 
		} catch (IOException e) {    // TODO Auto-generated catch block  
			e.printStackTrace();  
		} catch (ClassNotFoundException e) {    // TODO Auto-generated catch block  
			e.printStackTrace();  
		}   
	}
}

