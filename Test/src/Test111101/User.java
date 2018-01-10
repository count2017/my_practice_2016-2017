package Test111101;
/**
 * 1.模拟登陆，编写用户类，测试类。
  1>.给集合中存储5个用户对象。
  2>.从控制台输入用户名和密码，和集合中的对象信息进行比较，相同表示成功，不同表示失败。
  3>.有三次输入机会。
 * **/
public class User {
	private String name;
	private int password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, int password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	public String toString(){
		System.out.println(name+"  "+password);
		return "";
	}
}
