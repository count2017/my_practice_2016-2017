package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.Constant;
import util.GameUtil;
import util.MyFrame;

public class SolarFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star sun = new Star("images/sun.jpg", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	Planet earth = new Planet("images/Earth.jpg", sun, 150, 100, 0.05);
	Planet moon = new Planet("images/moon.jpg", earth, 30, 30, 0.1, true);
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		moon.draw(g);
	}
	public static void main(String[] args) {
		SolarFrame sf = new SolarFrame();
		sf.launchFrame();
	}
}
