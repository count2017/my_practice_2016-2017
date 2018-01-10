package Test111101;
/**
 * LinkedList中的，addFirst addLast getFirst，
 * getLast  removeFirst removeLast 应用。
 * **/
public class Test02 {

	public static void main(String[] args) {
		User u1 = new User("H",123);
		User u2 = new User("J",456);
		User u3 = new User("K",789);
		User u4 = new User("L",856);
		User u5 = new User("F",267);
		
		UserList2 usl2 = new UserList2();
		usl2.addUser(u1);
		usl2.addUser(u2);
		usl2.addUser(u3);
		
		usl2.ak2.addFirst(u4);
		System.out.println(usl2.ak2.getFirst());
		
		usl2.ak2.addLast(u5);
		System.out.println(usl2.ak2.getLast());
		
		usl2.ak2.removeFirst();
		System.out.println(usl2.ak2.getFirst());
		
		usl2.ak2.removeLast();
		System.out.println(usl2.ak2.getLast());
		
	}

}
