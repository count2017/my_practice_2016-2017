package Test1104;

public class Bus extends Car {
	double height;
	//构造方法
	public Bus(String a,String b,double c,double d){
		super(a,b,c);
		height = d;
	}
	
	//show方法
	public void show(){
		System.out.println("我是公交车类");
	}
	//setter、getter
	
	public double getHeight() {
		System.out.println("调用的是公交车类的get方法");
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
