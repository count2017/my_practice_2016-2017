package Test112201;

public class Administrator {
	private String name;

	public Administrator(String name) {
		super();
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void input(Goods g){
		Thread a = new Thread(new ProducerThread(this,g));
		a.start();
	}
	public void output(Goods g){
		Thread a = new Thread(new ConsumerThread(this,g));
		a.start();
	}
}
