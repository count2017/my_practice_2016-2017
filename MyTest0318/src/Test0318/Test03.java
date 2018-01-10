package Test0318;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test03 {
	static class OOMObject{
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = 1.1;
		List<OOMObject> list = new ArrayList<OOMObject>();
		List<List> list1 = new LinkedList<List>();
		while (true) {
			System.out.println("aa");
			list.add(new OOMObject());
			list1.add(list);
			i++;
			System.out.println(i);
        }
	}

}
