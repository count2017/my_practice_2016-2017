package Test1104;
/**
 * 2�����������������˻���������󷽷���ȡ���������
 * �����ֽ��˻��ࡢ���ÿ��˻��࣬ʵ�ֳ��󷽷������岻ͬ���߼���
 * д�����������ط�����
 * **/
public abstract class Account {
	private String name;
	private double balance;
	private int password;
	//���췽��
	public  Account(){
		System.out.println("���������˻�����޲ι��췽��");
	}
	
	public Account(String a,double b,int c){
		System.out.println("���������˻�����в����Ĺ��췽��");
		name = a;
		balance = b;
		password = c;
	} 
	//�����ȡ���������󷽷�
	public abstract double getMoney();
	public abstract double saveMoney();
	//setter��getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
}
