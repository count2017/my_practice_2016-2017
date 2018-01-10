package 并发.thread;

public class MoreBasicThreads {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
			new Thread(new LiftOff()).start();
		System.out.println("等待发射（升空）");
	}
}
