package Test111401;
import java.util.ArrayList;
/**
 * 100只猴子坐成一个圈，从1开始报数，报到第14只的那只猴子退出圈外，
 * 并重新开始计数，依次循环下去，直到圈中剩下一只猴子就是大王
 */
import java.util.LinkedList;
import java.util.List;

public class MonkeyKing {

	public static void main(String[] args) {
		List<Monkey> lin = new ArrayList<Monkey>();
		Monkey[] m = new Monkey[100];
		for (int i = 0, j = 1; i < m.length; i++, j++) {
			m[i] = new Monkey("猴子" + j);
		}
		for (int i = 0; i < m.length; i++) {
			lin.add(m[i]);
		}
//		for (Monkey monkey : lin) {
//			System.out.println(monkey);
//		}
		System.out.println("==============================================================");
		int count = 0;
		while (true) {
			for (int i = 0; i < lin.size(); i++) {
				count++;
				if (count == 14) {
					lin.remove(i);
					System.out.println(count+" "+i);
					count=0;
				}
				 
			}
			 
//			for (Monkey monkey : lin) {
//				System.out.println(monkey);
//			}
			System.out.println("==============================================================");
			if (lin.size() == 1) {
				System.out.println(lin);
				break;
			}
		}

	}

}
