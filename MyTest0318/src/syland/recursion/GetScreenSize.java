package syland.recursion;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GetScreenSize {
	static int[] get(){
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screensize.getWidth();
		int height = (int)screensize.getHeight();
		int[] wh = {width,height};
		return wh;
	}
	public static void main(String[] args) {
		System.out.println(get()[0]);
		System.out.println(get()[1]);
	}
}
