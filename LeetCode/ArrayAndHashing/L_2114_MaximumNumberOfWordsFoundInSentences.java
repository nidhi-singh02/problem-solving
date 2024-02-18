package LeetCode.ArrayAndHashing;

import java.util.StringTokenizer;

public class L_2114_MaximumNumberOfWordsFoundInSentences {

    public static void main(String[] args) {
        System.out.println("result: "+mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {
        // Approach 1
//        int maxNumberOfwords = Integer.MIN_VALUE;
//        for(String sentence:sentences){
//            maxNumberOfwords = Math.max(sentence.split(" ").length,maxNumberOfwords);
//        }
//        return maxNumberOfwords;

        // Approach 2
         int maxNumberOfwords = Integer.MIN_VALUE;
         for(String s:sentences){
             int countSpaces = 0;
             for( int i=0; i < s.length();i++){
                 if(s.charAt(i) == ' '){
                     countSpaces++;
                 }
             }
             maxNumberOfwords = Math.max(countSpaces+1,maxNumberOfwords);
         }

        return maxNumberOfwords;

    }
}
