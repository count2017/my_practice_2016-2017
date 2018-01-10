package Test0318;

class Demo{
	public int k;
	public Demo(){
		this.k = 0;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Demo d = new Demo();
		int _k = d.k;
		System.out.println(_k);
		d.k = 5;
		System.out.println(d.k);
		tell(d);
		System.out.println(d.k);
		
	}
	public static void tell(Demo demo){
		demo.k = 1;
	}
	
	
}
