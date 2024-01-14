package LeetCode.ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;

public class L_1768_MergeStringsAlternately {
    public static void main(String[] args){
        System.out.println("result: "+mergeAlternately("abc","pqr"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
//        List<Character> resultArray = new ArrayList<>();

        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();

        int LongestStr = Math.max(word1Chars.length,word2Chars.length);

        for(int i=0; i < LongestStr;i++){

            if(i < word1Chars.length){
//                resultArray.add(word1Chars[i]);
                result.append(word1Chars[i]);
            }
            if(i < word2Chars.length){
//                resultArray.add(word2Chars[i]);
                result.append(word2Chars[i]);
            }

        }

//        for(Character ch:resultArray){
//            result.append(ch);
//        }

        return result.toString();
    }

}
