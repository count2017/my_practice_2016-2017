package Test1104;
/**
 * 2、创建抽象类银行账户，定义抽象方法存款、取款，创建两个
 * 子类现金账户类、信用卡账户类，实现抽象方法，定义不同的逻辑。
 * 写测试类测试相关方法。
 * **/
public abstract class Account {
	private String name;
	private double balance;
	private int password;
	//构造方法
	public  Account(){
		System.out.println("我是银行账户类的无参构造方法");
	}
	
	public Account(String a,double b,int c){
		System.out.println("我是银行账户类的有参数的构造方法");
		name = a;
		balance = b;
		password = c;
	} 
	//定义存款、取款两个抽象方法
	public abstract double getMoney();
	public abstract double saveMoney();
	//setter、getter
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
