package 并发.thread;

public class LiftOff implements Runnable{
	
	protected int countDown=10;
	
	private static int taskCount=0;
	
	private final int id = taskCount++;
	
	public void LiftOff(){
	}
	
	public void LiftOff(int countDown){
		this.countDown = countDown;
	}
	
	public String status(){
		return "#"+id+"("+(countDown > 0 ? countDown : "LiftOff!")+").";
	}

	@Override
	public void run() {
		while(countDown-- > 0){
			System.out.println(status());
			Thread.yield();
			/*try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
	
}
