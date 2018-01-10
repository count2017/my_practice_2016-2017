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
			System.out.println("����������Ʊ");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			�������еȴ����������ڵȴ�����Դ���̶߳���
			t.notifyAll();
			System.out.println(p.getName()+"��Ʊ�ɹ�����ϢΪ"+t);
		}
			
	}
	
}
