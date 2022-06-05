package amartell.hackerrank.weekprep;

import java.util.Arrays;
import java.util.List;

public class LonelyInteger
{
    public static int lonelyinteger(List<Integer> a) {

        int answer = 0;
        for(Integer number: a)
        {
            answer ^= number;
            System.out.println(answer);
        }

        return answer;

       /* return a.stream()
                .filter(number -> a.indexOf(number) == a.lastIndexOf(number))
                .findFirst()
                .get();*/
    }

    public static void main(String[] args) {
        System.out.println(lonelyinteger(Arrays.asList(1,2,3,4,3,2,1)));
    }
}
