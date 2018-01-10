package Test1104;

public class Manager2 extends Staff2 {
	private double bonus;
	//构造方法
	public Manager2(String a,int b,double c,double d){
		super(a,b,c);
		bonus = d;
	}
	//setter、getter
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
