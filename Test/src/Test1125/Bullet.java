package Test1125;

import java.util.Random;

public class Bullet extends FlyingObject{
	private int speed = 3;
	public Bullet(int x,int y){
		image = GameFrame.bullet;
		width = image.getWidth();
		height = image.getHeight();
		this.x = x;//x��������Ӣ�ۻ���
		this.y = y;//y��������Ӣ�ۻ���
		
	}
	@Override
	public void step() {
		// TODO Auto-generated method stub
		y -= speed;
	}
}
