package Test1104;

public class JiaoChe extends Car {
	double height;
	//���췽��
	public JiaoChe(){
		System.out.println("���õ���С�γ�����޲εĹ��췽��");
	}
	public JiaoChe(String a,String b,double c,double d){
		
		super(a,b,c);
		System.out.println("���õ���С�γ�����вεĹ��췽��");
		setHeight(d);
	}
	
	//show����
	public void show(){
		System.out.println("����С�γ���");
	}
	//setter��getter
	public void setHeight(double a){
		System.out.println("���õ���С�γ����set����");
		height = a;
	}
	public double getHeight() {
		System.out.println("���õ���С�γ����get����");
		return height;
	}

	
}
