package Test1104;

public class TestVehicle {

	public static void main(String[] args) {
		//����Bus�Ķ���Ȼ����в���
		Bus b = new Bus("����","��������",1500.0,1.5);
		System.out.println(b.getBrand());
		System.out.println(b.getType());
		System.out.println(b.getHeight());
		//����JiaoChe�Ķ���Ȼ����в���(�޲�)
		System.out.println("----------------------------");
		JiaoChe j = new JiaoChe();
		System.out.println(j.getBrand());
		System.out.println(j.getWeight());
		System.out.println(j.getHeight());
		//����JiaoChe�Ķ���Ȼ����в��ԣ��вΣ�
		System.out.println("----------------------------");
		JiaoChe k = new JiaoChe("�ݱ�","С�γ�",1000.0,1.4);
		System.out.println(k.getHeight());
		System.out.println(k.getBrand());
	}

}
