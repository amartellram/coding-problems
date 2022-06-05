package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int maxBreaks = 0, minBreaks  = 0, min,  max;

        min = max = scores.get(0);
        for(int i = 1; i < scores.size(); i++){
            if(min > scores.get(i)) {
                min = scores.get(i);
                minBreaks++;
            }
            if(max < scores.get(i)){
                max = scores.get(i);
                maxBreaks++;
            }
        }
        return Arrays.asList(maxBreaks, minBreaks);
    }

    public static void main(String[] args) {

        List<Integer> scores = Arrays.asList(10,5,20,20,4,5,2,25,1);

        System.out.println(breakingRecords(scores));
    }
}
