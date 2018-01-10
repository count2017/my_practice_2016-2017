package Test0105;

public class Test {
	public static void main(String[] args) {
		for(int i=1; i<10; i++){
			System.out.println(i);
		}
		String str = "ab|cd|efgh";
		String[] a = str.split("\\|");
		for (String string : a) {
			System.out.print(string+"  ");
		}
	}
}
