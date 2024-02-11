package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        System.out.println("result: "+ Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0;i < nums.length;i++){
            int smallerNums = 0;
            for(int j=0; j < nums.length;j++){
                if(nums[i] > nums[j] && i != j){
                    smallerNums++;
                }

            }
            result[i] =smallerNums;
        }

        return result;

    }
}
