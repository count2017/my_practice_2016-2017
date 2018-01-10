package Test1125;

import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
	private int speed = 2;//²½Êý
	
	public Airplane(){
		image = GameFrame.airplane;
		width = image.getWidth();
		height = image.getHeight();
		Random rand = new Random();
		x = rand.nextInt(GameFrame.WIDTH-this.width);
		y = 50;
	}
	
	@Override
	public int getScore() {
		return 5;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		y += speed;
	}

}
