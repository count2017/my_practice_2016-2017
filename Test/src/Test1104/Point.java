package Test1104;
/**
 * ����һ��Point�࣬����ΪX,Y���꣬����һ��Բ��̳�������
 * ��һ���Լ��Ĺ��췽������Ҫʹ��super�ؼ��֣�����һ����Բ��������ӡ��Ϣ���ɣ�
�������贴��Բ��ʵ�����������һ��Ŀ��
 * **/

public class Point {
	private double x;
	private double y;
	//���췽��
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	//setter��getter

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	

}
