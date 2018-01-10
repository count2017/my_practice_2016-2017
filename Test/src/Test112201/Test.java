package Test112201;

public class Test {

	public static void main(String[] args) {
		Administrator p1 = new Administrator("老王");
		Administrator p2 = new Administrator("老刘");
		Administrator p3 = new Administrator("老张");
		Administrator p4 = new Administrator("老李");
		Administrator p5 = new Administrator("老赵");
		
		Goods g = new Goods("电子产品");
		
		p4.output(g);
		p2.output(g);
		p1.input(g);
		p3.output(g);
		
		p5.output(g);
		
		
		
	}

}
