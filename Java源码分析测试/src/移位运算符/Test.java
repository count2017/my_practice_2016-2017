package 移位运算符;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
//		a = a<<3;
		System.out.println(a);
		a = a >> 3;
		System.out.println(a);
		int b = 0x7fffffff;
		b = b >> 30;
		Object o = ~0 >> 1 ;
		System.out.println(o);
		System.out.println(b);
	}

}
