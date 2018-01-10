package Class类;

public class Test01 {
	public static void main(String[] args) {
		User u = new User("xiaohu","123");
		System.out.println(User.class.getName());
		System.out.println(User.class.getName().replaceAll(User.class.getPackage().getName()+".", ""));
	}
}
