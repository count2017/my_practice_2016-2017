package Test112201;

import java.util.LinkedList;

public class Storage {
	
	static LinkedList<Goods> lkl = new LinkedList<Goods>();
	
	public static Goods produce(){
		Goods g = new Goods();
		g = new Goods("���Ӳ�Ʒ");
		lkl.add(g);
		return g;
	}
	
	public static void save(Goods goods){
		if(goods.getName().equals("���Ӳ�Ʒ")){
			lkl.add(goods);
//			System.out.println("���Ļ��������");
		}else{
			System.out.println("��Ǹ�����ֿⲻ�洢�ǵ��Ӳ�Ʒ");
		}
	}
	
	public static Goods get(Goods goods){
		Goods g= null;
		if(lkl.peek() != null){
			g = lkl.get(0);
			lkl.remove(0);
		}else{
			System.out.println("�Բ��𣬲ֿ��ѿ�");
		}
		return g;
	}

}
