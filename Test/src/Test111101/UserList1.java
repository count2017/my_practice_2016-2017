package Test111101;
/**
 * 1.ģ���½����д�û��࣬�����ࡣ
  1>.�������д洢5���û�����
  2>.�ӿ���̨�����û��������룬�ͼ����еĶ�����Ϣ���бȽϣ���ͬ��ʾ�ɹ�����ͬ��ʾʧ�ܡ�
  3>.������������ᡣ
 * **/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList1 {
	List<User> ak = new ArrayList<User>();
	
	public String addUser(User a){
		if(ak.add(a)){
		}
		return "";
	}
	
	public void Bj(UserList1 ul){
		int k = 0,f = 0;
		while(k<3){
			Scanner sc = new Scanner(System.in);
			System.out.println("������������");
			String a = sc.next();
			System.out.println("���������룺");
			int b = sc.nextInt();
			User _u = new User(a,b);
		
			for (int i = 0; i < ul.ak.size(); i++) {
				if (_u.getName().equals(ul.ak.get(i).getName())&&
						_u.getPassword()==(ul.ak.get(i).getPassword())) {
					System.out.println("������ȷ");
					f++;
					k=3;
					break;
				}
			}
			if(f==0){
				k++;
				if(k<3){
					System.out.println("�û����������������������");
				}else{
					System.out.println("�Բ��������û�����������������ۼƴﵽ3��"
							+ "�������ٴ�����");
				}
			}
		}
	}
	
}
