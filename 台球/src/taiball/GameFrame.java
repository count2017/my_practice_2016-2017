package taiball;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GameFrame extends Frame{
	Image img = GameUtil.getImage("̨��/sun.jpg");
//	���ش���
	public void launchFrame(){
		setSize(500, 500);
		setLocation(100, 100);
		setVisible(true);
		
		new PaintThread().start();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	private double x =100, y = 100;
	@Override
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		
		Font f = new Font("����",Font.BOLD, 18);
		g.setFont(f);
		g.drawString("Hello World!", 100, 140);
		g.fillRect(100, 100, 20, 20);
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(100, 100, 20, 20);
		g.setColor(c);
		g.drawImage(img, (int)x, (int)y, null);
		
	}
//	����һ���ػ����ڵ��߳��࣬��һ���ڲ���
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
		GameFrame gf = new GameFrame();
		gf.launchFrame();
	}
}
