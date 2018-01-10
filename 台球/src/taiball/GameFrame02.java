package taiball;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���Դ���������������Ƕȷ���
 * **/
public class GameFrame02 extends Frame{
	Image img = GameUtil.getImage("̨��/sun.jpg");
//	���ش���
	public void launchFrame(){
		setSize(500,500);
		setLocation(200,200);
		setVisible(true);
		new PaintThread().start();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	private double x = 100, y =100;
	private double degree = Math.PI/3;
	private double speed = 10;
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		if(speed > 0){
			speed -= 0.05;
		}else{
			speed = 0;
		}
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		
		if(y > 500-30 || y < 30){
			degree = -degree;
		}
		if(x < 30 || x > 500 - 30){
			degree = Math.PI - degree;
		}
	}
	/**
	 * ����һ���ػ����ڵ��߳��࣬��һ���ڲ���
	 * @author dell
	 *
	 */
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		GameFrame02 gf = new GameFrame02();
		gf.launchFrame();
	}
	
}
