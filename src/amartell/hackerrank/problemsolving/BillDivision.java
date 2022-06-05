package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;

        for(int i= 0; i< bill.size();i++)
        {
            if(i!=k)
                sum+=bill.get(i);


        }

        int bc= sum/2;

        if(bc==b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-bc);

    }

    public static void main(String[] args) {

        List<Integer> prices = Arrays.asList(3,10,2,9);
        bonAppetit(prices, 1,7);
    }
}
