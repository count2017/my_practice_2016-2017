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
//	窗口的宽度（WIDTH）、窗口高度（HEIGHT）、背景图（background）、敌机(airplane)、小蜜蜂(bee)
//	  子弹(bullet)、英雄机0(hero0)、英雄机0(hero1)、游戏结束图(gameover)、暂停图(pause)、启动图(start)
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
	 //初始化静态资源（图片）、读取图片到静态变量中
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
//	显示分数、生命值
	public void paintFont(Graphics g){
		Font f = new Font("新宋体", Font.BOLD, 18);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.setFont(f);
		g.drawString("分数："+score, 20, 20);
		g.drawString("LIFE："+hero.getLife(), 20, 43);
		g.setColor(c);
	}
	
//	 --画英雄机(paintHero)
	public void paintHero(Graphics g){
		g.drawImage(hero.image,hero.x, hero.y, null);
	}
	
//	 --画敌机(小蜜蜂和敌机)(paintFlyingObject)
	public void paintFlyObject(Graphics g){
		for (int i = 0; i < flyings.length; i++) {
			FlyingObject f = flyings[i];
			g.drawImage(f.image,f.x, f.y, null);
		}
	}
//	 --画子弹(paintBullets)
	public void paintBullets(Graphics g){
		for (int i = 0; i < bullets.length; i++) {
			FlyingObject b = bullets[i];
			g.drawImage(b.image,b.x, b.y, null);
		}
	}
	
//	 --创建敌人(蜜蜂和敌机都是从上面落下的类似于敌人的对象)的方法nextOne()。蜜蜂和敌机是随机生成的
	public static FlyingObject nextOne(){
		Random rand = new Random();
		int type = rand.nextInt(20);
		if(type < 3){
			return new Bee();
		}else{
			return new Airplane();
		}
	}
//	--敌人入场的方法enterAction()
	int flyEnterIndex;
	public void enterAction(){
		flyEnterIndex++;
		if( flyEnterIndex % 40 == 0){
			FlyingObject obj = nextOne();
			flyings = Arrays.copyOf(flyings, flyings.length+1);
			flyings[flyings.length - 1] = obj;
		}
	}
//	--让所有的飞行物走一步stepAction()
	public void stepAction(){
		hero.step();
		for (int i = 0; i < flyings.length; i++) {
			flyings[i].step();
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}
	}
//	  --英雄机发射子弹（子弹入场）
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
//	 --一个子弹撞到敌人
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
//	检查游戏是否结束
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
//	根据state值判定游戏的行进状态
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
//	删除所有越界的飞行物
	public void outOfBoundsAction(){
		FlyingObject[] flyingLives = new FlyingObject[flyings.length ];
		int index = 0;
		//将不越界敌人对象添加到不越界敌人数组中
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
	
//	 --所有的子弹撞所有的敌人
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
		
			JFrame frame = new JFrame("雷霆战机1.1");
			GameFrame game = new GameFrame();//游戏初始面板
			game.action();
			frame.add(game);
			frame.setSize(WIDTH,HEIGHT);
			//设置窗体居中
			frame.setLocationRelativeTo(null);
			//设置窗体总在上面
			frame.setAlwaysOnTop(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		
	}
	
}
