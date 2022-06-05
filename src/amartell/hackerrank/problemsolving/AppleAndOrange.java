package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b,
                                             List<Integer> apples, List<Integer> oranges) {

        long countApplesIn = apples.stream()
                .filter(distance -> {
                    int realDistance = a + distance;
                    return realDistance >= s && realDistance <=t;
                })
                .count();

        System.out.println(countApplesIn);

        long countOrangesIn = oranges.stream()
                .filter(distance -> {
                    int realDistance =  b + distance;

                    return realDistance >= s && realDistance <=t;

                })
                .count();

        System.out.println(countOrangesIn);


    }


    public static void main(String[] args) {

        countApplesAndOranges(7, 10, 4, 12, Arrays.asList(2, 3, -4),
                        Arrays.asList(3,-2,-4));
    }
}
