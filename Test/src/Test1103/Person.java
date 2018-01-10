/**
 * 3����д����ģ�������˻����ܡ�Ҫ�����¡�
���ԡ��˺š�������������ַ���������С����������ȡ���ѯ��
�����û�������ʾ���������Ϣ�������������ʾ����ԭ�������մ�����
���մ����ȡ��ʱ����������С����С���ܾ��տ����ʾ�����ٱ������XXX�� 
 * **/
package Test1103;

public class Person {
	private String name;
	private String address;
	//���췽��
	public Person() {
		super();
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	//setter��getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//����
	public void use(Card a,String b,int c){
		if(a.getOption()==1){
//			a.get(b,c);
		}
		if(a.getOption()==2){
			
		}
		if(a.getOption()==3){
			
		}
		
	}
	
	
}
