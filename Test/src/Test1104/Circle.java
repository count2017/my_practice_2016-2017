package Test1104;

import java.util.Scanner;

public class Circle extends Point {
	//���췽����ʹ��super�ؼ���
	public Circle(double a,double b){
		super(a,b);
	}
	
	//��Բ����
	public void paint(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������Բ�İ뾶");
		double r = sc.nextDouble();
		double d = 2*r;
		//���ġ���һ����
		for(double i=r;i>=0;i-=0.1){
			
			//��������
			for(double k=0;k<=r;k+=0.1){
				System.out.print(" ");
			}
			for(double j=0;j>=Math.sqrt(r*r-i*i)-r;j-=0.05){
				System.out.print(" ");
			}
			System.out.println("*");
			//��������R
			for(double m=r;m>=0;m-=0.02){
				System.out.print(" ");
			}
			//��һ����
			for(double k=0;k<=r;k+=0.1){
				System.out.print(" ");
			}
			for(double j=r;j>=r-Math.sqrt(r*r-i*i);j-=0.05){
				System.out.print(" ");
			}
			System.out.println("*");
			
		}
		//�������ڶ�����
		for(double i=0;i<=r;i+=0.1){
			//��������
			for(double k=0;k<=r;k+=0.1){
				System.out.print(" ");
			}
			for(double j=0;j>=Math.sqrt(r*r-i*i)-r;j-=0.05){
			System.out.print(" ");
			}
			System.out.println("*");
			//��������R
			for(double m=r;m>=0;m-=0.02){
				System.out.print(" ");
			}
			//�ڶ�����
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
