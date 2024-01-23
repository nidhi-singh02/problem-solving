package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println("result: "+removeDuplicates(new int[]{0,0,1,1,2,3,4}));
    }
    public static int removeDuplicates(int[] nums) {
        // Traverse the array, keep a current pointer
        // if the element is unique, let it be, increase the current pointer
        // If it is duplicate, let the current pointer be there
        // Since the array is sorted, same elements will only be adjacent to each other
        int currIndex = 1;

        for( int i=0; i < nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[currIndex] = nums[i+1];
                currIndex++;
            }
        }
        return currIndex;
    }
}
