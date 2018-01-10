package transient关键字测试;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
	public static void main(String[] args) {
		User user = new User();
        user.setUsername("Alexia");
        user.setPasswd("123456");
        
        System.out.println("read before Serializable: ");
        System.out.println("username: " + user.getUsername());
        System.err.println("password: " + user.getPasswd());
        
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/user.txt"));
			oos.writeObject(user);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
	            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
	                    "F:/user.txt"));
	            user = (User) is.readObject(); // 从流中读取User的数据
	            is.close();
	            
	            System.out.println("\nread after Serializable: ");
	            System.out.println("username: " + user.getUsername());
	            System.err.println("password: " + user.getPasswd());
	            
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
		}
	
	
	
}
