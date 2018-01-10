/**
 * 
 */
/**
 * @author lenovo
 *
 */
package 整数溢出;

public class Test{
	
	public static void main(String[] args) {
		long a = 24 * 60 * 60 * 1000 * 1000;// 正确结果应为：86400000000
		System.out.println(a);
		long b = 24L * 60 * 60 * 1000 * 1000;
		System.out.println(b);
		long c = 24L;
		long d = c* 60 * 60 * 1000 * 1000;
		System.out.println(d);
		System.out.println(1.1/0.0);
	}
}