package taiball;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class GameFrame05 extends MyFrame{
	Image img = GameUtil.getImage("̨��/sun.jpg");
	double x, y;
	double degree = Math.PI/3;
	public void paint(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
		g.drawOval(100, 100, 300, 200);
		g.drawLine(100, 100, 200, 200);
		Color c = g.getColor();
//		g.setColor(Color.blue);
//		g.fillRect(0, 0, 500, 500);
		g.setColor(c);
		x =100+ 100*Math.cos(degree);
		y =200+ 50*Math.sin(degree);
		
		degree -=0.1;
	}
	public static void main(String[] args) {
		GameFrame05 gf = new GameFrame05();
		gf.launchFrame();
	}
	
}
