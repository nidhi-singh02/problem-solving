package LeetCode.ArrayAndHashing;

import java.util.Collections;

public class L_125_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("is palindrome :"+isPalindrome("A man, a plan, a canal -- Panama"));
    }
    public static boolean isPalindrome(String s) {
        String modifiedString = s.toLowerCase().strip().replaceAll("[\"-+:.\\-,\\[\\]@%\\\\$#!~^&*()_+=<>{}\\s]","");
        System.out.println("modified: "+modifiedString);
        int j=modifiedString.length()-1;
        int i=0;
       while(i < j){
            if(modifiedString.charAt(i) != modifiedString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
