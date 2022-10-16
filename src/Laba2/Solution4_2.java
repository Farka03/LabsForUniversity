package Laba2;

public class Solution4_2 {
    public int sol4_2(){
        int[][] array = {{1, 0, 1, 0}, {1, 1, 1, 0}, {0, 1, 0, 1}, {0, 0, 0, 0}};
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if((array[i][j] + array[i][j+1] +array[i+1][j] + array[i+1][j+1]) % 4 == 0) {
                    System.out.println("Не симпатичный квадрат");
                } else {
                    System.out.println("Симпатичный квадрат");
                }
            }
        }
        return 0;
    }
}
