package Test1104;

public class Car extends Vehicle {
	//���췽��
	public Car(){
		System.out.println("���õ��ǳ�����޲εĹ��췽��");
	}
	public Car(String a,String b,double c){
		
		super(a,b,c);
		System.out.println("���ǳ�����вι��췽��");
	}
	//show����
	public void show(){
		System.out.println("���ǳ���");
	}
}
