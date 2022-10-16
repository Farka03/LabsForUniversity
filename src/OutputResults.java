import Laba1.Solution2_1;
import Laba1.Solution3_1;
import Laba1.Solution4_1;
import Laba2.Solution3_2;
import Laba2.Solution4_2;

public class OutputResults {
    public static void main(String[] args){
        //Вывод 2 задания в 1 лабе
        Solution2_1 solution2 = new Solution2_1();
        System.out.println("y = " + solution2.sol2_1());
        //Вывод 3 задания в 1 лабе
        Solution3_1 solution3 = new Solution3_1();
        System.out.println("r = " + solution3.sol3_1());
        //Вывод 4 задания в 1 лабе
        Solution4_1 solution4 = new Solution4_1();
        System.out.println(solution4.sol4_1());
        //Вывод 3 задания во 2 лабе
        Solution3_2 solution3_2 = new Solution3_2();
        System.out.println(solution3_2.sol3_2());
        //Вывод 4 задания во 2 лабе
        Solution4_2 solution4_2 = new Solution4_2();
        System.out.println(solution4_2.sol4_2());
    }
}
