package amartell.practice;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class MinimumAmount {

    public static long calculateAmount(List<Integer> prices) {
        // Write your code here
        long sum = prices.get(0);
        int min = prices.get(0);
        for (int i = 1; i< prices.size(); i++)
        {

            int price = prices.get(i);
            if(price < min)
                min = price;
            int discount = min;
            int cost = price - discount < 0 ? 0: price - discount;

            sum += cost;
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> prices  = Arrays.asList(2,5,1,4);
        System.out.println(calculateAmount(prices));
    }
}
