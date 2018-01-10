package 并发.执行器;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import 并发.thread.LiftOff;

public class SingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++) exec.execute(new LiftOff());
		exec.shutdown();
	}
}
