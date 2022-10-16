package Laba1;

public class Solution3_1 {
    //Пусть x = 3 => f(x) = 9
    public double sol3_1(){
        return max(6);
    }
    public static double min(double x, double y){
        if(x > y){
            return y;
        } else if (x < y) {
            return x;
        } else {
            return 0;
        }
    }
    public static double max(double z){
        if(z > min(7, 8)){
            return z;
        } else if (z < min(7, 8)) {
            return min(7, 8);
        } else {
            return 0;
        }
    }
}
