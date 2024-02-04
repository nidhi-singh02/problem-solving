package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_1470_ShuffleTheArray{
    public static void main(String[] args) {
        System.out.println("result: "+ Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int i=0;
//        for(int j=0;j <nums.length;j++){
//            result[i] = nums[j];
//            i++;
//            result[i] = nums[j+n];
//            i++;
//
//            if(i == 2*n){
//                break;
//            }
//        }

        for(int j=0; j < n; j++){
            result[2*j] = nums[j];
            result[2*j+1] = nums[j+n];
        }

        return result;
    }
}
