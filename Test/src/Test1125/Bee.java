package Test1125;

import java.util.Random;

public class Bee extends FlyingObject implements Award{
	private int xSpeed = 1;
	private int ySpeed = 2;
	private int awardType;
	public Bee(){
		image = GameFrame.bee;
		width = image.getWidth();
		height = image.getHeight();
		Random rand = new Random();
		x = rand.nextInt(GameFrame.WIDTH-this.width);
		y = 100;
		awardType = rand.nextInt(2);
		
	}
	
	@Override
	public int getType() {
		return awardType;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		x += xSpeed;
		y += ySpeed;
		if(x > GameFrame.WIDTH - this.width){
			xSpeed = -1;
		}
		if(x < 0){
			xSpeed = 1;
		}
	}
	
}
