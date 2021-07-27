package projecteuler.problem2;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciNumbers {

    // Runtime O(1), since loop is always a constant amount of iterations; O(n), otherwise
    // Space O(1), space is always capped under constant; O(n), otherwise
    public static void main(String[] args) {
        // Java doesn't support tail call optimization, just create sequence iteratively

        List<Integer> evenTerms = new ArrayList<>();
        for (int i = 1, j = 2;;) {
            if (j % 2 == 0) {
                evenTerms.add(j);
            }
            int sum = i + j;
            if (sum > 4_000_000) {
                break;
            }
            i = j;
            j = sum;
        }

        System.out.println(evenTerms.stream().reduce(0, Integer::sum));
    }
}
