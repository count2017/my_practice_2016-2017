 package Test1122;

public class Passenger {
	private  String name;


	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public  void buy(Tickets ticket){
		System.out.println(name +"×¼±¸Âò"+ticket);
		Thread t = new Thread(new SellThread(this,ticket));
		t.start();
	}
	public void quit(Tickets t){
		Thread ts = new Thread(new BackThread(this,t));
		ts.start();
	}

}
