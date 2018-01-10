package Test1104;

public class JiaoChe extends Car {
	double height;
	//构造方法
	public JiaoChe(){
		System.out.println("调用的是小轿车类的无参的构造方法");
	}
	public JiaoChe(String a,String b,double c,double d){
		
		super(a,b,c);
		System.out.println("调用的是小轿车类的有参的构造方法");
		setHeight(d);
	}
	
	//show方法
	public void show(){
		System.out.println("我是小轿车类");
	}
	//setter、getter
	public void setHeight(double a){
		System.out.println("调用的是小轿车类的set方法");
		height = a;
	}
	public double getHeight() {
		System.out.println("调用的是小轿车类的get方法");
		return height;
	}

	
}
