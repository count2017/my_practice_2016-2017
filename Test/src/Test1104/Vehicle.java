package Test1104;
/**
 * 2、现有交通工具体系，总类为交通工具，交通工具分为汽车，船只，飞机，而汽车
 * 又分为轿车和公交车，每个类中都有show方法，说明自己是什么交通工具，
 * 请写出这些类，并使用测试类测试
 * **/
public class Vehicle {
	private String brand;
	private String type;
	private double weight;
	//构造方法
	public Vehicle(){
		System.out.println("调用的是交通工具类无参的构造方法");
	}
	public Vehicle(String brand,String type,double weight){
		System.out.println("我是交通工具类有参的构造方法");
		this.brand = brand;
		this.type = type;
		this.weight = weight;
	}
	//setter、getter
	public String getBrand() {
		System.out.println("调用的是交通工具类的get方法");
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		System.out.println("调用的是交通工具类的get方法");
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		System.out.println("调用的是交通工具类的get方法");
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//show方法
	public void show(){
		System.out.println("我是交通工具");
	}
	
}
