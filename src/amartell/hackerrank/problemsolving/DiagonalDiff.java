package amartell.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class DiagonalDiff {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int ltrDiag = 0, rtlDiag = 0;

        for(int i = 0; i < arr.size(); i++)
        {
            for(int j = 0; j< arr.get(i).size();j++)
            {
                if (i == j )
                    ltrDiag += arr.get(i).get(j);
                if( (i + j) == (arr.size() - 1))
                    rtlDiag += arr.get(i).get(j);
            }
        }
        return Math.abs(ltrDiag - rtlDiag);

    }

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(11, 2, 4);
        List<Integer> b = Arrays.asList(4, 5, 6);
        List<Integer> c = Arrays.asList(10, 8, -12);

        List<List<Integer>> m = Arrays.asList(a, b, c);

        int diagonalDifference = diagonalDifference(m);
        System.out.println("diagonalDiff : "+ diagonalDifference );
    }
}
