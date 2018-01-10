package Test111101;

public class Test01 {

	public static void main(String[] args) {
		User u1 = new User("H",123);
		User u2 = new User("J",456);
		User u3 = new User("K",789);
		User u4 = new User("L",856);
		User u5 = new User("F",267);
		
		UserList1 usl = new UserList1();
		usl.addUser(u1);
		usl.addUser(u2);
		usl.addUser(u3);
		
		usl.Bj(usl);
		
//		add(index, element),remove(index),remove(Object)”¶”√°£
		usl.ak.add(1, u4);
		System.out.println(usl.ak.get(1).getName());
		
		System.out.println(usl.ak.get(0).getName());
		usl.ak.remove(0);
		System.out.println(usl.ak.get(0).getName());
		
		usl.ak.remove(u4);
		System.out.println(usl.ak.get(0).getName());
	}

}
