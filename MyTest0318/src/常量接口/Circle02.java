package 常量接口;

public class Circle02 implements MyConstants{
    private double r;
    public Circle02 (double r){this.r = r;}
    public double getCircumference () {return 2 * r * MATH_PI;}
    public double getArea(){return r*r * MATH_PI;}
}
