package Test1104;

public class Bus extends Car {
	double height;
	//���췽��
	public Bus(String a,String b,double c,double d){
		super(a,b,c);
		height = d;
	}
	
	//show����
	public void show(){
		System.out.println("���ǹ�������");
	}
	//setter��getter
	
	public double getHeight() {
		System.out.println("���õ��ǹ��������get����");
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
