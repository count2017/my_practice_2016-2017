package Test0318;

import java.util.HashMap;

public class Test0808 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println(a);
		Animal b = new Animal("bird","blue");
		System.out.println(b);
		String test = " 你  好    ";
		System.out.println(test);
		String hh = test.trim();
		String hk = test.replaceAll("\\s+","");
		System.out.println(hh);
		System.out.println(hk);
		
		String filename = "测试用例_2_3._4._5.zip";
		int index = filename.lastIndexOf(".");
		System.out.println(index);
		System.out.println(filename.substring(index));
		
		HashMap<String,Animal> map = new HashMap<String,Animal>();
		map.put("kitty", b);
		map.put("dog",a);
		System.out.println(map);
		Animal animal0809 = new Animal("red","red",map);
		System.out.println(animal0809);
		animal0809.setMap(map);
		System.out.println(animal0809);
		System.out.println("Animal类中Animal属性kitty的值是"+a.getKitty());
		System.out.println("##########################");
		
	}

}
