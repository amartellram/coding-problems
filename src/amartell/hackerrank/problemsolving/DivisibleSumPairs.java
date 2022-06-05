package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;
        for(int i = 0; i< ar.size(); i++)
        {
            for (int j = i + 1 ; j < ar.size() ; j++){
                if((ar.get(i)+ar.get(j)) % k ==0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,3,2,6,1,2);
        System.out.println(divisibleSumPairs(a.size(),3,a));
    }
}
