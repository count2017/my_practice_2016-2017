package Test112201;

import java.util.LinkedList;

public class Storage {
	
	static LinkedList<Goods> lkl = new LinkedList<Goods>();
	
	public static Goods produce(){
		Goods g = new Goods();
		g = new Goods("电子产品");
		lkl.add(g);
		return g;
	}
	
	public static void save(Goods goods){
		if(goods.getName().equals("电子产品")){
			lkl.add(goods);
//			System.out.println("您的货物已入库");
		}else{
			System.out.println("抱歉，本仓库不存储非电子产品");
		}
	}
	
	public static Goods get(Goods goods){
		Goods g= null;
		if(lkl.peek() != null){
			g = lkl.get(0);
			lkl.remove(0);
		}else{
			System.out.println("对不起，仓库已空");
		}
		return g;
	}

}
