package amartell.practice.java;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {

        IntStream numbers = IntStream.of(1,2,3,4,6);

        OptionalInt sum = numbers.reduce((s,n) -> s+n);

        System.out.println(sum);

        List<Integer> nums = Arrays.asList(1,2,3,4,6);

        Optional<Integer> s = nums.stream().reduce((t,n) -> t+n);

        System.out.println(s);

        Map<Boolean, List<Integer>> map = Stream.of(1,45,60,34,34,32,06,95)
                .collect(Collectors.partitioningBy(i -> i <50));

        System.out.println(map);


    }
}
