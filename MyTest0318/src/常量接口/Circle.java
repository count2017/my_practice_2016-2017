package 常量接口;

public class Circle {
    private double r;//半径
    public Circle(double r){
        this.r = r;
    }
    public double getCircumference(){
        return 2 * r * MyConstants.MATH_PI;
    }
}
