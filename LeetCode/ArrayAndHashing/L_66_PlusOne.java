package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_66_PlusOne {
    public static void main(String[] args) {
        System.out.println("result: "+ Arrays.toString(plusOne(new int[]{9,8,9})));
    }

    public static int[] plusOne(int[] digits) {

        // I cannot simply add 1 to the last element of the array,
        // as it can have double-digit answer, will needs to be carry forwarded to the element to
        // its left
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If sum is greater than 9
            digits[i] = 0;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
