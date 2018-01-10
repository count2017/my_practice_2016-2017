package Test1103;

import java.util.Scanner;

public class TestPC {

	public static void main(String[] args) {
	Person m = new Person("H","��Ҵ�");
	Card n = new Card("107",123456,1000, 0);
	Scanner sc = new Scanner(System.in);
	//
	System.out.println("��ѡ������1.ȡǮ��2.��Ǯ��3.��ѯ���");
	int a = sc.nextInt();
	n.setOption(a);
	
	while(true){
		System.out.println("�������˺ţ�");
		String b = sc.next();
		
		System.out.println("����������");
		int c = sc.nextInt();
		
		//
	//	m.use(n, b, c);
	//	if(n.get(b, c)==-1){
	//		break;
	//	}
		}
	}
}
