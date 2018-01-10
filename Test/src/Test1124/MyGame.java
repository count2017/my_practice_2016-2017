package Test1124;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MyGame extends JFrame{
//	JPanel jp;
//	public MyGame(){
//		
//		
//	}
	public int x = 100,y = 100;
	BufferedImage i1;
	public void init(){
	
	
		Dimension scs = Toolkit.getDefaultToolkit().getScreenSize();
		int w = scs.width;
		int h = scs.height;
		this.setBounds(0,0,w,h);
		this.setVisible(true);
		this.setName("MyG");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			i1 = ImageIO.read(MyGame.class.getResource("hero0.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new repaintThread().start();
		
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		g.drawOval(100, 100, 100, 100);
		Font f = new Font(null, 5, 18);
		g.setFont(f);
		g.drawString("Hello World!", 200, 150);
		g.drawImage(i1, x, y, null);
		x += 3;
		y += 3;
	}
	
	class repaintThread extends Thread{
		public void run(){
			while(true){
				
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		new MyGame().init();
	}
}
