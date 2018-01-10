package solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

public class Planet extends Star{
	protected double longAxis;
	protected double shortAxis;
	protected double degree;
	protected double speed;
	Star center;
	boolean satellite;
	
	public void draw(Graphics g){
		super.draw(g);
		move();
		if(!satellite){
			drawTrace(g);
		}
	}
	
	public void move(){
//		—ÿ◊≈Õ÷‘≤πÏº£∑…––
		x = (center.x + center.width/2) + longAxis*Math.cos(degree);
		y = (center.y + center.height/2) + shortAxis*Math.sin(degree);
		
		degree += speed;
	}
	
	public void drawTrace(Graphics g){
		int ovalX, ovalY, ovalWidth, ovalHeight;
		ovalX = (int)(longAxis*2);
		ovalY = (int)(shortAxis*2);
		ovalWidth = (int)(center.width/2+center.x-longAxis);
		ovalHeight = (int)(center.height/2+center.y-shortAxis);
		
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);
		g.setColor(c);
	}
	
	public Planet(Image img, double x, double y){
		super(img,x,y);
	}
	public Planet(String imgpath, double x, double y){
		super(imgpath, x, y);
	}
	public Planet(String imgpath, Star center, 
			double longAxis, double shortAxis, double speed){
		super(GameUtil.getImage(imgpath));
		this.center = center;
		this.x = center.x - longAxis;
		this.y = center.y - shortAxis;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}

	public Planet(String imgpath, Star center, 
			double longAxis, double shortAxis, double speed, boolean satellite) {
		this(imgpath, center, longAxis, shortAxis, speed);
		this.satellite = satellite;
	}
	
}
