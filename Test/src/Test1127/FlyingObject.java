package Test1127;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	protected int x;
	protected  int y;
	protected  int width;
	protected  int height;
	protected  BufferedImage image;
	
	
	public abstract void step();
	public abstract boolean outOfBounds();
	public boolean shootBy(Bullet b){
		int x1 = x + width;
		int y1 = y + height;
		if(x < b.x && b.x < x1 && y < b.y && b.y < y1){
			return true;
		}
		return false;
	}
}
