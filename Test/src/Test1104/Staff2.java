package Test1104;
/**
 * 1���������ǿ���һ��ϵͳʱ��Ҫ��Ա�����н�ģ��Ա������3�����ԣ�������
 * �����Լ����ʡ�
����Ҳ��Ա�������˺���Ա���������⣬���⻹��һ���ֺ�����ԡ�
����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
Ա����: name  id  pay
�����ࣺ�̳�Ա���࣬�����Լ����е�bonus����
 * **/
public class Staff2 {
	private String name;
	private int id;
	private double pay;
	//���췽��
	public Staff2(String a,int b,double c){
		name = a;
		id = b;
		pay = c;
	}
	//setter��getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	

}
