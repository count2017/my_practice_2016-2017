package Test1104;

public class TestVehicle {

	public static void main(String[] args) {
		//创建Bus的对象，然后进行测试
		Bus b = new Bus("大众","公共汽车",1500.0,1.5);
		System.out.println(b.getBrand());
		System.out.println(b.getType());
		System.out.println(b.getHeight());
		//创建JiaoChe的对象，然后进行测试(无参)
		System.out.println("----------------------------");
		JiaoChe j = new JiaoChe();
		System.out.println(j.getBrand());
		System.out.println(j.getWeight());
		System.out.println(j.getHeight());
		//创建JiaoChe的对象，然后进行测试（有参）
		System.out.println("----------------------------");
		JiaoChe k = new JiaoChe("捷豹","小轿车",1000.0,1.4);
		System.out.println(k.getHeight());
		System.out.println(k.getBrand());
	}

}
