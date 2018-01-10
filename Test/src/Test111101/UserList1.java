package Test111101;
/**
 * 1.模拟登陆，编写用户类，测试类。
  1>.给集合中存储5个用户对象。
  2>.从控制台输入用户名和密码，和集合中的对象信息进行比较，相同表示成功，不同表示失败。
  3>.有三次输入机会。
 * **/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList1 {
	List<User> ak = new ArrayList<User>();
	
	public String addUser(User a){
		if(ak.add(a)){
		}
		return "";
	}
	
	public void Bj(UserList1 ul){
		int k = 0,f = 0;
		while(k<3){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入姓名：");
			String a = sc.next();
			System.out.println("请输入密码：");
			int b = sc.nextInt();
			User _u = new User(a,b);
		
			for (int i = 0; i < ul.ak.size(); i++) {
				if (_u.getName().equals(ul.ak.get(i).getName())&&
						_u.getPassword()==(ul.ak.get(i).getPassword())) {
					System.out.println("输入正确");
					f++;
					k=3;
					break;
				}
			}
			if(f==0){
				k++;
				if(k<3){
					System.out.println("用户名或密码错误，请重新输入");
				}else{
					System.out.println("对不起，您的用户名或密码输入错误累计达到3次"
							+ "，不能再次输入");
				}
			}
		}
	}
	
}
