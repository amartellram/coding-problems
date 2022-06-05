package amartell.hackerrank.problemsolving;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

        int[]  occurrences = new int[5];

        for (int i = 0 ; i<arr.size(); i++){
            occurrences[arr.get(i)-1]++;
        }

        int max = Integer.MIN_VALUE;
        int value = 0;

        for(int i=0; i< occurrences.length;i++)
        {
            if(max < occurrences[i]){
                max = occurrences[i];
                value = i+1;
            }
        }

        return value;
    }

    public static int migratoryBirdsAnyNumbers(List<Integer> arr) {

        Map<Integer, Integer> occurrencesNumbers = new HashMap<>();

        for (Integer integer: arr){
            if(occurrencesNumbers.containsKey(integer)){
               int count =  occurrencesNumbers.get(integer) + 1;
               occurrencesNumbers.put(integer, count);
            } else{
                occurrencesNumbers.put(integer, 0);
            }
        }

         Map<Integer, Set<Integer>> processedMap= occurrencesNumbers.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toSet())));


        Map<Integer, Set<Integer>> orderedMap = new TreeMap<>(Collections.reverseOrder());

        orderedMap.putAll(processedMap);

       int min =  orderedMap.entrySet().stream()
                .findFirst()
                .map(e -> {
                    return Collections.min(e.getValue());
                })
                .get();

       return min;

    }


    public static void main(String[] args) {

        int n = migratoryBirds(Arrays.asList(2,2,1,1));
        System.out.println(n);
    }
}
