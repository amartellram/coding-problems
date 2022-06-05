package amartell.practice;

import java.util.Arrays;
import java.util.List;

public class Triplet {

    public static int inversionCount(List<Integer> integers) {
        int count = 0;
        int n = integers.size();

        for(int i = 0; i < n-2; i++)
            for(int j = i+1; j < n-1; j++)
                for(int k = j+1;k < n;k++)
                    if(integers.get(i) > integers.get(j) && integers.get(j) > integers.get(k))
                        count++;
        return count;
    }

    public static int inversionCount2(List<Integer> integers) {
        int count = 0;
        int n = integers.size();



        return count;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,9,6,4,5);
        System.out.println(inversionCount(integers));
    }
}
