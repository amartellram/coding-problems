package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

   public static boolean lcm(List<Integer> list, Integer x)
   {
       for (Integer number:list) {
           if(x%number!=0) return false;
       }

       return true;
   }

   public static boolean gcd(List<Integer> list, Integer x)
   {
       for(Integer number:list){
           if(number%x != 0) return false;
       }
       return true;
   }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int count = 0;
        for(int i=1; i<100;i++) {
            if (lcm(a,i) && gcd(b, i)) count++;
        }
        return  count;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2,4);
        List<Integer> b = Arrays.asList(16,32,96);
        System.out.println(getTotalX(a,b));
    }
}
