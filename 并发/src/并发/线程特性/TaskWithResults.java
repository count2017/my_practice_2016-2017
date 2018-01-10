package 并发.线程特性;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskWithResults implements Callable<String>{
	private int id;
	
	public TaskWithResults(int id){
		this.id = id;
	}
	
	@Override
	public String call(){
		
		return "result of TaskWithResults" + id;
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i=0;i<10;i++){
			results.add(exec.submit(new TaskWithResults(i)));
		}
	
		for (Future<String> future : results) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}finally{
				exec.shutdown();
			}
		}
		
	}
}
