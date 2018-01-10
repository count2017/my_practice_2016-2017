package 抽象类实现接口;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.run(15);
		c.Scream("");
		StringBuffer sb = new StringBuffer();
		String str = "hehe";
		sb.append(str);
		System.out.println(str.toString() + sb.toString());
	}

}
