package Test1125;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
	private int life;
	private int doublefire;
	private BufferedImage[] images;
	private int index;//�����л�Ƶ��
	public Hero(){
		image = GameFrame.hero0;//ָ���˴���һ��Ӣ�ۻ�������
		width = image.getWidth();
		height = image.getHeight();
		x = 150;
		y = 400;
		life = 3;
		doublefire = 0;//��������
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
//	��������
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
//	Ӣ�ۻ��ƶ�����
	public void moveTo(int x, int y){
		this.x = x - this.width/2;
		this.y = y - this.height /2;
	}
//��������ֵ�ķ���
	public void addLife(){
		life++;
	}
//	���ӻ�������
	public void addDoubleFire(){
		doublefire += 40;
	}
	
}
