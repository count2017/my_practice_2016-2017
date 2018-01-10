package Test1122;

public class TestTickets {

	public static void main(String[] args) {
		Conductor.input(1000);
		Passenger p1 = new Passenger("H");
		Passenger p2 = new Passenger("K");
		Passenger p3 = new Passenger("T");
		
		Tickets t = new Tickets("k1024",456,"2016-11-22");
		
		p2.buy(t);
		p1.buy(t);
		p3.buy(t);
		p2.quit(t);
	}

}
