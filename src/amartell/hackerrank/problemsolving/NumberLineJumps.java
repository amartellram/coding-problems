package amartell.hackerrank.problemsolving;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int t = 1;


        if(v1 -v2 > 0 && (x2-x1) % (v1-v2) == 0)
            return "YES";
        else
            return "NO";

    }

    public static void main(String[] args) {
        System.out.println(kangaroo(1,5,1,3));
    }
}
