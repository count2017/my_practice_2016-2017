package Test1104;

import java.util.Scanner;

public class Circle extends Point {
	//构造方法，使用super关键字
	public Circle(double a,double b){
		super(a,b);
	}
	
	//画圆方法
	public void paint(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径");
		double r = sc.nextDouble();
		double d = 2*r;
		//第四、第一象限
		for(double i=r;i>=0;i-=0.1){
			
			//第四象限
			for(double k=0;k<=r;k+=0.1){
				System.out.print(" ");
			}
			for(double j=0;j>=Math.sqrt(r*r-i*i)-r;j-=0.05){
				System.out.print(" ");
			}
			System.out.println("*");
			//整体右移R
			for(double m=r;m>=0;m-=0.02){
				System.out.print(" ");
			}
			//第一象限
			for(double k=0;k<=r;k+=0.1){
				System.out.print(" ");
			}
			for(double j=r;j>=r-Math.sqrt(r*r-i*i);j-=0.05){
				System.out.print(" ");
			}
			System.out.println("*");
			
		}
		//第三、第二象限
		for(double i=0;i<=r;i+=0.1){
			//第三象限
			for(double k=0;k<=r;k+=0.1){
				System.out.print(" ");
			}
			for(double j=0;j>=Math.sqrt(r*r-i*i)-r;j-=0.05){
			System.out.print(" ");
			}
			System.out.println("*");
			//整体右移R
			for(double m=r;m>=0;m-=0.02){
				System.out.print(" ");
			}
			//第二象限
			for(double k=0;k<=r;k+=0.1){
				System.out.print(" ");
			}
			for(double j=r;j>=r-Math.sqrt(r*r-i*i);j-=0.05){
			System.out.print(" ");
			}
			System.out.println("*");
			
		
		}
	}
	
	
}
