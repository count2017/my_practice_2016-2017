package Test1104;
/**
 * 1������Ա���࣬����������ַ�������������ԣ�������;�������������ԣ�
 * �������н�ͨ�����������������ܲ��ţ��������ж�����ʾ�������Ϣ��
 * ����show������ʵ�ַ�ʽ��ͬ����д�����๹�췽���������Ե�get��set������
��Ҫ�õ�this��super�ؼ��֡�
 * 
 * **/
public class Board extends Staff {
	private double allowance;
	//���췽��
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
