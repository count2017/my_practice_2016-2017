package Test1127;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JPanel{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 600;
	public static final int START = 0;
	public static final int RUNNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	private int state;
	int k,j;
//	���ڵĿ�ȣ�WIDTH�������ڸ߶ȣ�HEIGHT��������ͼ��background�����л�(airplane)��С�۷�(bee)
//	  �ӵ�(bullet)��Ӣ�ۻ�0(hero0)��Ӣ�ۻ�0(hero1)����Ϸ����ͼ(gameover)����ͣͼ(pause)������ͼ(start)
	public static BufferedImage background;
	public static BufferedImage airplane;
	public static BufferedImage bullet;
	public static BufferedImage bee;
	public static BufferedImage hero0;
	public static BufferedImage hero1;
	public static BufferedImage gameover;
	public static BufferedImage pause;
	public static BufferedImage start;
	
	private Hero hero = new Hero();
	private FlyingObject[] flyings = {};
	private Bullet[] bullets = {};
	
//	public GameFrame(){
//		flyings = new FlyingObject[2];
//		flyings[0] = new Airplane();
//		flyings[1] = new Bee();
//		bullets = new Bullet[1];
//		bullets[0] = new Bullet(50,100);
////		new pThread().start();
//	}
	 //��ʼ����̬��Դ��ͼƬ������ȡͼƬ����̬������
	static{
		try {
			background = ImageIO.read(GameFrame.class.getResource("background.png"));
			airplane = ImageIO.read(GameFrame.class.getResource("airplane.png"));
			bullet = ImageIO.read(GameFrame.class.getResource("bullet.png"));
			bee= ImageIO.read(GameFrame.class.getResource("bee.png"));
			hero0 = ImageIO.read(GameFrame.class.getResource("hero0.png"));
			hero1 = ImageIO.read(GameFrame.class.getResource("hero1.png"));
			gameover = ImageIO.read(GameFrame.class.getResource("gameover.png"));
			pause = ImageIO.read(GameFrame.class.getResource("pause.png"));
			start = ImageIO.read(GameFrame.class.getResource("start.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(background,0,0,null);
		paintHero(g);
		paintFlyObject(g);
		paintBullets(g);
		paintFont(g);
		paintState(g);
	}
//	��ʾ����������ֵ
	public void paintFont(Graphics g){
		Font f = new Font("������", Font.BOLD, 18);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.setFont(f);
		g.drawString("������"+score, 20, 20);
		g.drawString("LIFE��"+hero.getLife(), 20, 43);
		g.setColor(c);
	}
	
//	 --��Ӣ�ۻ�(paintHero)
	public void paintHero(Graphics g){
		g.drawImage(hero.image,hero.x, hero.y, null);
	}
	
//	 --���л�(С�۷�͵л�)(paintFlyingObject)
	public void paintFlyObject(Graphics g){
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject f = flyings[i];
			g.drawImage(f.image,f.x, f.y, null);
		}
	}
//	 --���ӵ�(paintBullets)
	public void paintBullets(Graphics g){
		for (int i = 0; i < bullets.length; i++) {
			FlyingObject b = bullets[i];
			g.drawImage(b.image,b.x, b.y, null);
		}
	}
	
//	 --��������(�۷�͵л����Ǵ��������µ������ڵ��˵Ķ���)�ķ���nextOne()���۷�͵л���������ɵ�
	public static FlyingObject nextOne(){
		Random rand = new Random();
		int type = rand.nextInt(20);
		if(type < 3){
			return new Bee();
		}else{
			return new Airplane();
		}
	}
//	--�����볡�ķ���enterAction()
	int flyEnterIndex;
	public void enterAction(){
		flyEnterIndex++;
		if( flyEnterIndex % 40 == 0){
			FlyingObject obj = nextOne();
			flyings = Arrays.copyOf(flyings, flyings.length+1);
			flyings[flyings.length - 1] = obj;
		}
	}
//	--�����еķ�������һ��stepAction()
	public void stepAction(){
		hero.step();
		for (int i = 0; i < flyings.length; i++) {
			flyings[i].step();
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}
	}
//	  --Ӣ�ۻ������ӵ����ӵ��볡��
	int shootIndex;
	public void shootAction(){
		shootIndex++;
		if(shootIndex % 30 == 0){
			bangAction();
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets, bullets.length + bs.length);
			System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length);
		}
	}
//	 --һ���ӵ�ײ������
	int score;
	public void bang(Bullet bullet){
		int index = -1;
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject f = flyings[i];
			if(f.shootBy(bullet)){
				index = i;
				break;
			}
		}
		if(index != -1){
			FlyingObject one = flyings[index];
			if(one instanceof Enemy){
				Enemy e = (Enemy)one;
				score += e.getScore();
			}
			if(one instanceof Award){
				Award a = (Award)one;
				int type = a.getType();
				switch (type) {
				case Award.DOUBLE_FIRE:
					hero.addDoubleFire();
					break;
				case Award.LIFE:
					hero.addLife();
					break;
				 
				}
			}
			FlyingObject t = flyings[index];
			flyings[index] = flyings[flyings.length - 1];
			flyings[flyings.length - 1] = t;
			flyings = Arrays.copyOf(flyings, flyings.length - 1);
		}
	}	
//	bangAction()
	public void bangAction(){
		for (int i = 0; i < bullets.length; i++) {
			bang(bullets[i]);
		}
	}
//	�����Ϸ�Ƿ����
	public void checkGameOverAction(){
		if(isGameOver()){
			state = GAME_OVER;
		}
	}
	public boolean isGameOver(){
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject f = flyings[i];
			if(hero.hit(f)){
				hero.subtractLife();
				hero.setDoublefire(0);
				
				FlyingObject t = flyings[i];
				flyings[i] = flyings[flyings.length - 1];
				flyings[flyings.length - 1] = t;
				flyings = Arrays.copyOf(flyings, flyings.length - 1);
			}
		}
		return hero.getLife() <= 0;
	}
//	����stateֵ�ж���Ϸ���н�״̬
	public void paintState(Graphics g){
		switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;
		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAME_OVER:
			g.drawImage(gameover, 0, 0, null);
		default:
			break;
		}
	}
//	ɾ������Խ��ķ�����
	public void outOfBoundsAction(){
		FlyingObject[] flyingLives = new FlyingObject[flyings.length ];
		int index = 0;
		//����Խ����˶�����ӵ���Խ�����������
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject f = flyings[i];
			if(!f.outOfBounds()){
				flyingLives[index] = f;
				index++;
			}
		}
		flyings = Arrays.copyOf(flyingLives, index);
		index = 0;
		Bullet[] bulletLives = new Bullet[bullets.length];
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			if(!b.outOfBounds()){
				bulletLives[index] = b;
				index++;
			}
		}
		bullets = Arrays.copyOf(bulletLives, index);
	}
	
//	 --���е��ӵ�ײ���еĵ���
	private Timer timer;
	int interval = 10;
	public void action(){
		MouseAdapter k = new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				state = RUNNING;
			}
			public void mouseMoved(MouseEvent e){
				if(state == RUNNING){
					int x = e.getX();
					int y = e.getY();
					hero.moveTo(x,y);
				}
			}
		};
		this.addMouseListener(k);
		this.addMouseMotionListener(k);
		timer = new Timer();
		 timer.schedule(new TimerTask() {
			@Override
			public void run() {
				if(state == RUNNING){
					enterAction();
					stepAction();
					shootAction();
					bangAction();
					outOfBoundsAction();
					repaint();
				}
			}
		}, interval, interval);
	}
	
	public static void main(String[] args) {
		
			JFrame frame = new JFrame("����ս��1.1");
			GameFrame game = new GameFrame();//��Ϸ��ʼ���
			game.action();
			frame.add(game);
			frame.setSize(WIDTH,HEIGHT);
			//���ô������
			frame.setLocationRelativeTo(null);
			//���ô�����������
			frame.setAlwaysOnTop(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		
	}
	
}
