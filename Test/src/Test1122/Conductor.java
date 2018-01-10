package Test1122;

import java.util.LinkedList;

public class Conductor {
	static LinkedList<Tickets> lkl = new LinkedList<Tickets>();
	public static void input(int number){
		
		Tickets[] kt = Tickets.generate(number);
		for (int j = 0; j < kt.length; j++) {
			Conductor.lkl.add(kt[j]);
		}
	}
	
	public static  Tickets sell(Tickets t){
		Tickets ts = null;
		for (Tickets tickets : lkl) {
			if(t.equals(tickets)){
				System.out.println("ÕıÔÚ³öÆ±"+t);
				ts = t;
				lkl.remove(t);
				break;
			}
		}
		return ts;
	}
	
	public static void back(Tickets t){
		lkl.add(t);
	}
}
