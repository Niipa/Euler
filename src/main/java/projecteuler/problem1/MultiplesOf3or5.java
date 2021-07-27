package projecteuler.problem1;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOf3or5 {

    // Runtime:
    // O(1), 3 or 5 below 1000; O(2n), 3 or 5 below n
    // Space:
    // O(1), allocate 3 ot 5 below 1000;
    // O(n), the number of multiples between 3 and "n" can be calculated by (3k>=n) and
    //       the number of multiples between 5 and "n" can be calculated by (5l>=n) therefore
    //       the total number of multiples we need to store is about "n/3 + n/5"
    //       (double counting multiples of 15) which simplifies to O(n)
    public static void main(String[] args) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }
        System.out.println(multiples.stream().reduce(0, Integer::sum));
    }
}
