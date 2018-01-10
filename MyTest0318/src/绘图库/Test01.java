package 绘图库;

public class Test01 {
	static void draw(){
		int N = 100;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N*N);
		StdDraw.setPenRadius(.01);
		for(int i=1;i<=N;i++){
			StdDraw.point(i, i);
			StdDraw.point(i,i*i);
			StdDraw.point(i, i*Math.log(i));
			StdDraw.point(i,i*40);
		}
	}
	public static void main(String[] args) {
		draw();
	}
	
}
