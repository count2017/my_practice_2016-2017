package Test1127;

import java.util.Random;

public class Bullet extends FlyingObject{
	private int speed = 9;
	public Bullet(int x,int y){
		image = GameFrame.bullet;
		width = image.getWidth();
		height = image.getHeight();
		this.x = x;//x坐标随着英雄机动
		this.y = y;//y坐标随着英雄机动
		
	}
	@Override
	public void step() {
		// TODO Auto-generated method stub
		y -= speed;
	}
	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return this.y > GameFrame.HEIGHT && this.y < 0;
	}
}
