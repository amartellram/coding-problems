package amartell.hackerearth;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int sum = 0;

        String all = s.nextLine().trim();

        String[] numbers = all.split(" ");

        for (int i = 0; i< numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);
            sum+=number;
        }

        System.out.println(sum);
    }
}
