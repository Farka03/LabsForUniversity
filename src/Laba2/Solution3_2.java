package Laba2;

public class Solution3_2 {
    public int sol3_2() {
        int[] n = {2, 4, 2, 3, 2, 6, 5, 7, 8, 2, 3, 5, 6, 6, 2, 3, 5, 6, 7, 8, 6, 5, 2, 1, 2, 4, 5, 6, 8, 7};
        for (int i = 0; i < n.length; i++) {
            try {
                if (n[i] > n[i - 1] && n[i] > n[i + 1]) {
                    System.out.println(n[i]);
                }
            } catch (Exception e) { }
        }
        return 0;
    }
}
