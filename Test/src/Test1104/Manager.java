package Test1104;
/**
 * 1������Ա���࣬����������ַ�������������ԣ�������;�������������ԣ�
 * �������н�ͨ�����������������ܲ��ţ��������ж�����ʾ�������Ϣ��
 * ����show������ʵ�ַ�ʽ��ͬ����д�����๹�췽���������Ե�get��set������
��Ҫ�õ�this��super�ؼ��֡�
 * 
 * **/
public class Manager extends Staff{
	private String department;
	//���췽��
	public Manager(String name,String address,
			double salary,String department){
		super(name,address,salary);
		this.department = department;
	}
	//setter��getter
	public void setDepartment(String department){
		this.department = department;
	}
	public String getDepartment(){
		return department;
	}
	
}
