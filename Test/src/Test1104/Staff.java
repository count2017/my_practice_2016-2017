package Test1104;
/**
 * 1、现有员工类，有姓名，地址，基本工资属性，董事类和经理类除以上属性，
 * 董事类有交通补助，经理类有所管部门，三个类中都有显示其基本信息的
 * 方法show，但其实现方式不同，请写出各类构造方法，及属性的get，set方法。
并要用到this和super关键字。
 * 
 * **/
public class Staff {
	private String name;
	private String address;
	private double salary;
	//构造方法
	public Staff(){
		
	}
	public Staff(String a,String b,double c){
		name = a;
		address = b;
		salary = c;
	}
	//setter、
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	//getter
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public double getSalary(){
		return salary;
	}
	//show方法
	public void show(){
		System.out.println(this.name);
		System.out.println(address);
		System.out.println(getSalary());
	}
	
	
}
