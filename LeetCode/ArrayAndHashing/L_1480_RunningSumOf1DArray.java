package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_1480_RunningSumOf1DArray {
    public static void main(String[] args) {
        System.out.println("result: "+ Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum=0;
        int i=0;
        for(int num:nums){
             sum = sum+num;
             result[i] = sum;
             i++;
        }

        return result;

    }
}
