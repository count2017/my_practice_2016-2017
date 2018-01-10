package 抽象类实现接口;

public abstract class A implements IB{
	
	
	@Override
	public void playGames(String gameName) {
		// TODO Auto-generated method stub
		System.out.println("I'm playing"+gameName);
	}

	@Override
	public void Scream(String scream){
		
	}
}
