package Test111401;

import java.util.ArrayList;
import java.util.List;

public class MonkeyKing01 {

	public static void main(String[] args) {
		List<Monkey> lin = new ArrayList<Monkey>();
		Monkey[] m = new Monkey[100];
		for (int i = 0, j = 1; i < m.length; i++, j++) {
			m[i] = new Monkey("ºï×Ó" + j);
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
