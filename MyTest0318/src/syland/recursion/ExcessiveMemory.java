package syland.recursion;

public class ExcessiveMemory {

    public static double harmonic(int n) {
        if (n == 1) return 1.0;
        return harmonic(n-1) + 1.0/n;
    } 

    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
        StdOut.println(harmonic(5));
    }

}
