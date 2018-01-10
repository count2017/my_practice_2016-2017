package test090;

public class Thread implements Runnable{
	
	private Runnable target;

	@Override
	public void run() {
		if(target != null)
			target.run();
		
	}

}
