package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_238_MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public static void moveZeroes(int[] nums) {
        // First approach: Traverse the array, use two pointers
        // One for the current position we are at and
        // another for current available index where non-zero element can be inserted
        // if non-zero value is encountered and put the current element at the available index
        // change the curr pointer everytime we move
//        int curr=0;
        // Second approach : Without curr pointer
        int available = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[available] = nums[i];
                available++;
            }
//            curr++;
        }

        for (int j = available; j < nums.length; j++) {
            nums[j] = 0;
        }

        System.out.println("nums: " + Arrays.toString(nums));
    }
}
