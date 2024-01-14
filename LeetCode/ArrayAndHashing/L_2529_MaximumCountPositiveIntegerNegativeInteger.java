package LeetCode.ArrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_2529_MaximumCountPositiveIntegerNegativeInteger {

    public static void main(String[] args){
        int[] input = {-1764,-1562,-1226,-1216,-402,-386,-133,979,1227,1992};
        System.out.println("ans: "+maximumCount(input));
    }
    public static int maximumCount(int[] nums) {
        // nums sorted in increasing order
        // 0 is neither positive nor negative

        // Brute force - Time Complexity - O(n)
        // Space complexity - O(1)
//        int pos=0, neg=0;
//
//        for(int i=0;i <nums.length;i++){
//            if(nums[i] > 0){
//                pos++;
//            } else if (nums[i] < 0) {
//                neg++;
//
//            }
//        }
//
//        return Math.max(pos,neg);
        // TBD : Not passing all testcases
        // Approach 2 - Can we take advantage of the fact, array is sorted
        int left=0;
        int right = nums.length-1;
        int pos=0, neg =0;

        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] > 0){
                // Positive, all elements to its right are positive
                pos = pos+right - mid +1;
                right = mid-1;
            } else if (nums[mid] < 0) {
                neg = neg + mid - left ;
                left = mid+1;

            }else{
                // number is zero - assume left is negative and right is positive, I don't have to search anymore
                neg = neg + mid - left;
                left = mid;
                break;
            }

        }

        for(int j=left; j < nums.length;j++){
            if (nums[j] == 0){
                left++;
            }
        }
        if (left <= right){
            pos = right - left+1;
        }

        return Math.max(pos,neg);

    }
}
