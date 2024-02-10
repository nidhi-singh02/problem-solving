package LeetCode.ArrayAndHashing;

import java.util.Collections;
import java.util.Objects;

public class L_125_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("is palindrome :" + isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
//
//        String modifiedString = s.toLowerCase().strip().replaceAll("[\"-+:.\\-,\\[\\]@%\\\\$#!~^&*()_+=<>{}\\s]","");
//        System.out.println("modified: "+modifiedString);
//        int j=modifiedString.length()-1;
//        int i=0;
//       while(i < j){
//            if(modifiedString.charAt(i) != modifiedString.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
        StringBuilder OnlyValid = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                OnlyValid.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String filteredString = OnlyValid.toString();
        String reversedString = OnlyValid.reverse().toString();
        return filteredString.equals(reversedString);
//       return Objects.equals(OnlyValid,OnlyValid.reverse());
    }
}