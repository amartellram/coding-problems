package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {

        int n= s.size();
        int count = 0;
        for(int i = 0; i<= n - m;i++) {
            int sum = 0;
            for(int j = i; j< i+m ;j++){
                sum+=s.get(j);
            }
            if(sum == d)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(2,2,1,3,2);
        System.out.println(birthday(s,4,2));
    }
}
