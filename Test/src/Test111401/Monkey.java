package Test111401;

public class Monkey {
	private String name;
	

	public Monkey() {
		super();
	}


	public Monkey(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Monkey [name=" + name + "]";
	}
	

}
