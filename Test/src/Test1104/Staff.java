package Test1104;
/**
 * 1������Ա���࣬����������ַ�������������ԣ�������;�������������ԣ�
 * �������н�ͨ�����������������ܲ��ţ��������ж�����ʾ�������Ϣ��
 * ����show������ʵ�ַ�ʽ��ͬ����д�����๹�췽���������Ե�get��set������
��Ҫ�õ�this��super�ؼ��֡�
 * 
 * **/
public class Staff {
	private String name;
	private String address;
	private double salary;
	//���췽��
	public Staff(){
		
	}
	public Staff(String a,String b,double c){
		name = a;
		address = b;
		salary = c;
	}
	//setter��
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
	//show����
	public void show(){
		System.out.println(this.name);
		System.out.println(address);
		System.out.println(getSalary());
	}
	
	
}
