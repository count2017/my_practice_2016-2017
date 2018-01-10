package 内部类;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Class<Singleton> clazz = null;
		try {
			//Class.forName()默认会初始化类的加载，即加载、链接、初始化三个步骤都会执行
			//ClassLoader.load只是进行加载步骤，并未进行初始化、链接两个步骤
			clazz = (Class<Singleton>) Class.forName("内部类.Singleton");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("外部类被成功解析："+clazz);
	}
}
