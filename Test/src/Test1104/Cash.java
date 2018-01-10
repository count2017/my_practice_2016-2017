package Test1104;

import java.util.Scanner;

/**
 * 2、创建抽象类银行账户，定义抽象方法存款、取款，创建两个
 * 子类现金账户类、信用卡账户类，实现抽象方法，定义不同的逻辑。
 * 写测试类测试相关方法。
 * **/
public class Cash extends Account{
	//构造方法
	public Cash(){
		System.out.println("我是现金类无参的构造方法");
	}
	public Cash(String a,double b,int c){
		super(a,b,c);
		System.out.println("调用现金类的有参 的构造方法");
	}
	//Scanner
	Scanner sc = new Scanner(System.in);
	//实现父类（账户类）中的抽象方法
	public double getMoney(){
		System.out.println("您好，您目前正在取款");
		int i = 1;
		while(i==1){
			System.out.println("请输入姓名：");
			String n = sc.next();
			System.out.println("请输入密码：");
			int p = sc.nextInt();
			
			if(n.equals(getName()) & p==getPassword()){
				//第二次循环首
				while(true){
				System.out.println("请输入取款金额：");
				double je = sc.nextDouble();
				if(je>getBalance()){
					System.out.println("您的余额不足，请重新输入取款金额：");
				}else{
					double a = getBalance()-je;
					setBalance(a);
					System.out.println("您本次取款数为"+je);
					System.out.println("剩余金额为"+getBalance());
					//跳出第一次循环
					i++;
					//跳出第二次循环
					break;
				}
				//第二次循环尾
				}
				
			}else{
				System.out.println("您的姓名或密码错误，请重新输入");
			}
			
			
		//第一次循环尾	
		}
		return -1;
	}
	public double saveMoney(){
		System.out.println("您好，您目前正在存款");
		int i = 1;
		while(i==1){
			System.out.println("请输入姓名：");
			String n = sc.next();
			System.out.println("请输入密码：");
			int p = sc.nextInt();
			
			if(n.equals(getName()) & p==getPassword()){
				System.out.println("请输入存款金额：");
				double je = sc.nextDouble();
				double a = getBalance()+je;
				setBalance(a);
				System.out.println("您本次存入的金额为"+je);
				System.out.println("账户余额为"+getBalance());
				i++;
				
			}else{
				System.out.println("您的姓名或密码错误，请重新输入");
			}
			
			
		//第一次循环尾	
		}
		return -1;
		
	}

}
