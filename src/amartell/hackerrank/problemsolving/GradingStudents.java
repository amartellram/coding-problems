package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        return grades.stream()
                .map(grade ->
                     grade < 38 || grade % 5 < 3 ? grade:
                            grade + (5 - grade % 5))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73,67,38,33);
        System.out.println(gradingStudents(grades));
    }
}
