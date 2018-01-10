package Test11114;
/**
 * 100ֻ��������һ��Ȧ,��1��ʼ����,������14����ֻ�����˳�
Ȧ��,�����¿�ʼ����,����ѭ����ȥ,ֱ��Ȧ��ֻʣ��һֻ����
,���Ǵ���
 * **/
import java.util.LinkedList;
import java.util.List;

public class TestMonkey {

	public static void main(String[] args) {
		Monkey[] b = new Monkey[300];
		for (int i = 0; i < b.length; i++) {
			b[i] = new Monkey(i,"����"+i);
		}
		
		LinkedList<Monkey> s = new LinkedList<Monkey>();
		for (int i = 0; i < b.length; i++) {
			s.add(b[i]);
		}
	
		while(s.size()>=14){
			s.remove(13);
			for (int i = s.size()-1; i >= 13 ; i--) {
				s.addFirst(s.getLast());
				s.remove(s.size()-1);
			}
			
		}
		
		while(s.size()>1){
			int a = 14%(s.size());
			if(a!=0){
				s.remove(a-1);
				for (int i = s.size()-1; i >=(a-1); i--) {
					s.addFirst(s.getLast());
					s.remove(s.size()-1);
				}
			}else{
				s.remove(s.size()-1);
			}
		}
		
		for (Monkey monkey : s) {
			System.out.println("�����ǣ�"+monkey);
		}
		
	}

}
