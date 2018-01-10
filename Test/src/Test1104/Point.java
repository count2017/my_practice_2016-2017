package Test1104;
/**
 * 声明一个Point类，属性为X,Y坐标，声明一个圆类继承它，并
 * 有一个自己的构造方法，需要使用super关键字，其有一个画圆方法（打印信息即可）
测试类需创建圆的实例，请完成这一题目。
 * **/

public class Point {
	private double x;
	private double y;
	//构造方法
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	//setter、getter

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	

}
