package Test11114;

public class Monkey {
	private int num;
	private String name;
	public Monkey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Monkey(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Monkey [num=" + num + ", name=" + name + "]";
	}
	
}
