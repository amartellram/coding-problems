package amartell.hackerrank.weekprep;

import java.util.Arrays;
import java.util.List;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {

        Integer[] freq = new Integer[100];

        for(int i= 0; i< 100; i++){
            freq[i] = 0;
        }

        for(int i=0;i<arr.size();i++){
            freq[arr.get(i)]++;
        }

        return Arrays.asList(freq);
    }

    public static void main(String[] args) {
        System.out.println(countingSort(Arrays.asList(1,1,3,2,1)));
    }
}
