package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_1920_BuildArrayFromPermutation{
    public static void main(String[] args) {
        System.out.println("result:"+ Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
           
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}