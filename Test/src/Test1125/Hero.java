package Test1125;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
	private int life;
	private int doublefire;
	private BufferedImage[] images;
	private int index;//控制切换频率
	public Hero(){
		image = GameFrame.hero0;//指定了创建一个英雄机的样子
		width = image.getWidth();
		height = image.getHeight();
		x = 150;
		y = 400;
		life = 3;
		doublefire = 0;//单倍火力
		images = new BufferedImage[]{GameFrame.hero0,GameFrame.hero1};
		index = 0;
	}
	@Override
	public void step() {
		// TODO Auto-generated method stub
		index++;
		int a = index/10;
		int b = a%2;
		image = images[b];
	}
//	发弹方法
	public Bullet[] shoot(){
		int xStep = this.width/4;
		if(doublefire > 0){
			Bullet[] bullets = new Bullet[2];
			bullets[0] = new Bullet(this.x+xStep,this.y-20);
			bullets[1] = new Bullet(this.x+3*xStep,this.y-20);
			doublefire -= 2;
			return bullets;
		}else{
			Bullet[] bullets = new Bullet[1];
			bullets[0] = new Bullet(this.x+2*xStep,this.y-20);
			return bullets;
		}
	}
//	英雄机移动方法
	public void moveTo(int x, int y){
		this.x = x - this.width/2;
		this.y = y - this.height /2;
	}
//增加生命值的方法
	public void addLife(){
		life++;
	}
//	增加火力方法
	public void addDoubleFire(){
		doublefire += 40;
	}
	
}
