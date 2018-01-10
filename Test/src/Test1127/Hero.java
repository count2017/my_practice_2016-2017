package Test1127;

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
	
//	��ȡ����ֵ�������ڴ�������ʾ
	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
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
		if(100 > doublefire && doublefire > 0){
			Bullet[] bullets = new Bullet[2];
			bullets[0] = new Bullet(this.x+xStep,this.y-20);
			bullets[1] = new Bullet(this.x+3*xStep,this.y-20);
			doublefire -= 2;
			return bullets;
		}else if(doublefire > 100){
			Bullet[] bullets = new Bullet[4];
			bullets[0] = new Bullet(this.x+0*xStep,this.y-20);
			bullets[1] = new Bullet(this.x+3*xStep,this.y-20);
			bullets[2] = new Bullet(this.x+2*xStep,this.y-20);
			bullets[3] = new Bullet(this.x+1*xStep,this.y-20);
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
	
//	���û���ֵ
	public void setDoublefire(int doublefire) {
		this.doublefire = doublefire;
	}

	//	����ֵ���ķ���
	public void subtractLife(){
		life--;
	}
//	���ӻ�������
	public void addDoubleFire(){
		doublefire += 40;
	}
// Խ�緽����Ĭ��false
	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}
//	���Ӣ�ۻ��͵��˵���ײ��this:Ӣ�ۻ���other������
	public boolean hit(FlyingObject other){
		int x1 = other.x - this.width/2;
		int x2 = other.x + other.width + this.width/2;
		int y1 = other.y - this.height /2;
		int y2 = other.y + other.height + this.height /2;
		int hx = this.x + this.width/2;
		int hy = this.y + this.height/2;
		return x1 < hx  &&  hx < x2  &&  y1 < hy  &&  hy < y2;
	}
}
