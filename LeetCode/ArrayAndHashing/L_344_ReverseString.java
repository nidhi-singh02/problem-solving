package LeetCode.ArrayAndHashing;

import java.util.Arrays;

public class L_344_ReverseString {
    public static void main(String[] args) {
       char[] input = new char[]{'h','e','l','l','o'};
        reverseString(input);
        System.out.println("result: "+ Arrays.toString(input));
    }

    public static void reverseString(char[] s) {
        // Approach 1 - Use extra memory
//        char[] result = new char[s.length];
//        int j=0;
//        for(int i=s.length-1; i >= 0 ;i--){
//            result[j] = s[i];
//            j++;
//        }
//
//        System.out.println("result: "+Arrays.toString(result));
//        s = Arrays.copyOf(result, result.length);
//        System.out.println("s: "+Arrays.toString(s));

        // Approach 2 - O(1) extra memory = In place modify the input array
        int start=0;
        int end  = s.length-1;
       while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
