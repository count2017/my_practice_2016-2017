package Test1122;

public class BackThread implements Runnable{
	private Passenger p;
	private Tickets t;
	
	public BackThread(Passenger p, Tickets t) {
		super();
		this.p = p;
		this.t = t;
	}

	@Override
	public void run() {
		synchronized (t) {
			Conductor.back(t);
			System.out.println("您正打算退票");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			唤醒所有等待队列中正在等待此资源的线程对象
			t.notifyAll();
			System.out.println(p.getName()+"退票成功，信息为"+t);
		}
			
	}
	
}
