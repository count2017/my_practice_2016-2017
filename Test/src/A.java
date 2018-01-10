import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入a值");
		int a = sc.nextInt();
		System.out.println("请输入次数");
		int b = sc.nextInt();
		int sum = 0;
		int m = 0;
		int k = 0;
//		for(int i=1; i<=a; i++){
			for(int j=1; j<=b; j++){
				sum += Math.pow(10, j-1);
				k += sum;
									}
			
//								}
		m = k*a;
		System.out.println(m);
	}

}
