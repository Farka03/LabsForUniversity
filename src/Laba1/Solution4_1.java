package Laba1;

public class Solution4_1 {
    public double sol4_1(){
        double y;
        for(double i = 5.62; i < 15.62; i+= 0.5){
            y = 0.41 + Math.pow(i, 2/3) * Math.cos(i + 2.7);
            System.out.println("x = " + i);
            System.out.println("y = " + y);
        }
        return 0;
    }
}
