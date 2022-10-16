package Laba1;

public class Solution2_1 {
    public double sol2_1(){
        return firstExample(7.4, -2.1, 0.15) + secondExample(0.15, 7.4, 4.5, -2.1) - thirdExample(7.4, -2.1, 0.15);
    }
    public static double firstExample(double c, double d, double x){
        return Math.sqrt((c - (d * Math.pow(x, 2))) / x);
    }
    public static double secondExample(double x, double c, double a, double d){
        return Math.log10(Math.pow(x, 2) + c) / ((0.7 * x) + (a * d));
    }
    public static double thirdExample(double c, double d, double x){
        return Math.pow(10, -2) / (c - (d * Math.pow(x, 3)));
    }
}
