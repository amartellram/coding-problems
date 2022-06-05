package amartell.hackerrank.monthprep;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        long sum = 0;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for(Integer number: arr)
        {
            if(number > maxNumber)
                maxNumber = number;
            if(number < minNumber)
                minNumber = number;
            sum+=number;
        }

        System.out.println((sum - maxNumber) + " "+ (sum - minNumber));


        long minSum = 0;
        long maxSum = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++)
        {
            if (i > 0)
                maxSum += arr.get(i);
            if(i<arr.size()-1)
                minSum += arr.get(i);
        }

        System.out.println(minSum + " "+ maxSum);


    }


    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1,3,5,7,9));
    }
}
