package Test1104;
/**
 * 2�����н�ͨ������ϵ������Ϊ��ͨ���ߣ���ͨ���߷�Ϊ��������ֻ���ɻ���������
 * �ַ�Ϊ�γ��͹�������ÿ�����ж���show������˵���Լ���ʲô��ͨ���ߣ�
 * ��д����Щ�࣬��ʹ�ò��������
 * **/
public class Vehicle {
	private String brand;
	private String type;
	private double weight;
	//���췽��
	public Vehicle(){
		System.out.println("���õ��ǽ�ͨ�������޲εĹ��췽��");
	}
	public Vehicle(String brand,String type,double weight){
		System.out.println("���ǽ�ͨ�������вεĹ��췽��");
		this.brand = brand;
		this.type = type;
		this.weight = weight;
	}
	//setter��getter
	public String getBrand() {
		System.out.println("���õ��ǽ�ͨ�������get����");
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		System.out.println("���õ��ǽ�ͨ�������get����");
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		System.out.println("���õ��ǽ�ͨ�������get����");
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//show����
	public void show(){
		System.out.println("���ǽ�ͨ����");
	}
	
}
