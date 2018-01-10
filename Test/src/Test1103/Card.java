/**
 * 3����д����ģ�������˻����ܡ�Ҫ�����¡�
���ԡ��˺š�������������ַ���������С����������ȡ���ѯ��
�����û�������ʾ���������Ϣ�������������ʾ����ԭ�������մ�����
���մ����ȡ��ʱ����������С����С���ܾ��տ����ʾ�����ٱ������XXX�� 
 * **/
package Test1103;




public class Card {
	//��������������
	private String id;
	private int password;
	private double balance;
	private int option;
	//���캯��
	public Card() {
		super();
	}
	public Card(String id, int password, double balance,int option) {
		super();
		this.id = id;
		this.password = password;
		this.balance = balance;
		this.option = option;
	}
	//setter��getter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + option;
		result = prime * result + password;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (option != other.option)
			return false;
		if (password != other.password)
			return false;
		return true;
	}
		
		
		
		
}
