package Test111101;
/**
 * 1.ģ���½����д�û��࣬�����ࡣ
  1>.�������д洢5���û�����
  2>.�ӿ���̨�����û��������룬�ͼ����еĶ�����Ϣ���бȽϣ���ͬ��ʾ�ɹ�����ͬ��ʾʧ�ܡ�
  3>.������������ᡣ
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
