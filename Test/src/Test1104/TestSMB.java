package Test1104;

public class TestSMB {

	public static void main(String[] args) {
		Board b = new Board("HH","Hcun",10000.0,1000);
		Manager m = new Manager("KK","Kcun",8000.0,"KJ");
		System.out.println(b.getAddress());
		System.out.println(m.getDepartment());
	}

}
