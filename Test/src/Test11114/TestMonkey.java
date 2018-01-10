package Test11114;
/**
 * 100只猴子坐成一个圈,从1开始报数,报到第14的那只猴子退出
圈外,并重新开始计数,依次循环下去,直到圈中只剩下一只猴子
,就是大王
 * **/
import java.util.LinkedList;
import java.util.List;

public class TestMonkey {

	public static void main(String[] args) {
		Monkey[] b = new Monkey[300];
		for (int i = 0; i < b.length; i++) {
			b[i] = new Monkey(i,"猴子"+i);
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
			System.out.println("猴王是："+monkey);
		}
		
	}

}
