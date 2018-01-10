package Test1104;
/**
 * 1、现有员工类，有姓名，地址，基本工资属性，董事类和经理类除以上属性，
 * 董事类有交通补助，经理类有所管部门，三个类中都有显示其基本信息的
 * 方法show，但其实现方式不同，请写出各类构造方法，及属性的get，set方法。
并要用到this和super关键字。
 * 
 * **/
public class Board extends Staff {
	private double allowance;
	//构造方法
	public Board(String name,String address,double salary,
			double allowance){
		super(name,address,salary);
		this.allowance = allowance;
	}
	//setter
	public void setAllowance(double allowance){
		this.allowance = allowance;
	}
	//getter
	public double getAllowance(){
		return allowance;
	}
	
}
