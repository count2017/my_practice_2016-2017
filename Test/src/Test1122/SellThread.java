package Test1122;

import java.util.LinkedList;

public class SellThread implements Runnable{
	private Passenger p;
	private Tickets ticket;
	
	public SellThread(Passenger p, Tickets ticket) {
		super();
		this.p = p;
		this.ticket = ticket;
	}

	public Passenger getP() {
		return p;
	}

	public void setP(Passenger p) {
		this.p = p;
	}

	public Tickets getTicket() {
		return ticket;
	}

	public void setTicket(Tickets ticket) {
		this.ticket = ticket;
	}

	@Override
	public void run() {
		synchronized(ticket){
			Tickets t = Conductor.sell(ticket);
			while(t == null){
				System.out.println(p.getName()+"抱歉，票已售出");
				try {
					ticket.wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(t != null){
				System.out.println(p.getName()+"购票成功");
			}
		
		}
	}

}
