package Test1104;

public class Car extends Vehicle {
	//构造方法
	public Car(){
		System.out.println("调用的是车类的无参的构造方法");
	}
	public Car(String a,String b,double c){
		
		super(a,b,c);
		System.out.println("我是车类的有参构造方法");
	}
	//show方法
	public void show(){
		System.out.println("我是车类");
	}
}
