package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer,Integer> countSocks = new HashMap<>();

        for(Integer i: ar){
            if(countSocks.containsKey(i)){
                int count = countSocks.get(i);
                countSocks.put(i, ++count);
            }else{
                countSocks.put(i, 1);
            }
        }

        return countSocks.values().stream()
                .mapToInt(integer -> integer / 2)
                .sum();

    }

    public static void main(String[] args) {
        List<Integer> socks = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        System.out.println(sockMerchant(socks.size(), socks));
    }
}
