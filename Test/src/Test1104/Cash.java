package Test1104;

import java.util.Scanner;

/**
 * 2�����������������˻���������󷽷���ȡ���������
 * �����ֽ��˻��ࡢ���ÿ��˻��࣬ʵ�ֳ��󷽷������岻ͬ���߼���
 * д�����������ط�����
 * **/
public class Cash extends Account{
	//���췽��
	public Cash(){
		System.out.println("�����ֽ����޲εĹ��췽��");
	}
	public Cash(String a,double b,int c){
		super(a,b,c);
		System.out.println("�����ֽ�����в� �Ĺ��췽��");
	}
	//Scanner
	Scanner sc = new Scanner(System.in);
	//ʵ�ָ��ࣨ�˻��ࣩ�еĳ��󷽷�
	public double getMoney(){
		System.out.println("���ã���Ŀǰ����ȡ��");
		int i = 1;
		while(i==1){
			System.out.println("������������");
			String n = sc.next();
			System.out.println("���������룺");
			int p = sc.nextInt();
			
			if(n.equals(getName()) & p==getPassword()){
				//�ڶ���ѭ����
				while(true){
				System.out.println("������ȡ���");
				double je = sc.nextDouble();
				if(je>getBalance()){
					System.out.println("�������㣬����������ȡ���");
				}else{
					double a = getBalance()-je;
					setBalance(a);
					System.out.println("������ȡ����Ϊ"+je);
					System.out.println("ʣ����Ϊ"+getBalance());
					//������һ��ѭ��
					i++;
					//�����ڶ���ѭ��
					break;
				}
				//�ڶ���ѭ��β
				}
				
			}else{
				System.out.println("���������������������������");
			}
			
			
		//��һ��ѭ��β	
		}
		return -1;
	}
	public double saveMoney(){
		System.out.println("���ã���Ŀǰ���ڴ��");
		int i = 1;
		while(i==1){
			System.out.println("������������");
			String n = sc.next();
			System.out.println("���������룺");
			int p = sc.nextInt();
			
			if(n.equals(getName()) & p==getPassword()){
				System.out.println("���������");
				double je = sc.nextDouble();
				double a = getBalance()+je;
				setBalance(a);
				System.out.println("�����δ���Ľ��Ϊ"+je);
				System.out.println("�˻����Ϊ"+getBalance());
				i++;
				
			}else{
				System.out.println("���������������������������");
			}
			
			
		//��һ��ѭ��β	
		}
		return -1;
		
	}

}
