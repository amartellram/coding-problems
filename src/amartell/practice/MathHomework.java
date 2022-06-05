package amartell.practice;

import java.util.Arrays;
import java.util.List;

public class MathHomework {


    public static int find_binary(int[] array, int l, int r, int x)
    {
        System.out.println(l+", " + r+ ", "+x);
        if(l <= r){
            int mid = (l+r)/2;
            System.out.println("array["+mid+"] = "+ array[mid]);
            if(array[mid] == x)
                return mid;
            if(array[mid] > x)
                return find_binary(array, l, mid-1, x);
            return find_binary(array, mid+1, r, x);
        }
        return -1;
    }

    public static int minNum(int threshold, List<Integer> points)
    {
       if (threshold + points.get(0) > points.get(points.size()-1))
           return points.size();

       int value = threshold + points.get(0);

       int pos = find_binary(points.stream().mapToInt(i ->i).toArray(), 0, points.size() -1, value);


       if(pos == -1)
           return points.size();
       int minNum =  (pos+2)/2;
      return minNum;
    }

    public static void main(String[] args) {
        List<Integer> solve = Arrays.asList(1,2,3,5,8);

        System.out.println(minNum(4, solve));
    }
}
