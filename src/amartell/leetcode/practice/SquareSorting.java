package amartell.leetcode.practice;

import java.util.Arrays;
import java.util.Collections;

public class SquareSorting {
    public static int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length;i++){
            nums[i]*=nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[]  nums = {-7,-3,2,3,11};
        int [] sorted = sortedSquares(nums);
        for(int n: sorted) {
            System.out.print(n + " ");
        }
    }
}
