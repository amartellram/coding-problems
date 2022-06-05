package amartell.leetcode.practice;

public class FindNumbersWithEven {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int number:nums){
            int nDigits =0;
            while(number > 0 ){
                number = number/10;
                nDigits++;
            }

            if(nDigits%2==0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {555,901,482,1771};
        System.out.println(findNumbers(numbers));
    }
}
