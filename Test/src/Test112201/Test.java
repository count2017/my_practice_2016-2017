package Test112201;

public class Test {

	public static void main(String[] args) {
		Administrator p1 = new Administrator("����");
		Administrator p2 = new Administrator("����");
		Administrator p3 = new Administrator("����");
		Administrator p4 = new Administrator("����");
		Administrator p5 = new Administrator("����");
		
		Goods g = new Goods("���Ӳ�Ʒ");
		
		p4.output(g);
		p2.output(g);
		p1.input(g);
		p3.output(g);
		
		p5.output(g);
		
		
		
	}

}
