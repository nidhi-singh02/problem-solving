package LeetCode.ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;

public class L_2942_FindWordsContainingCharacter {
    public static void main(String[] args) {
        System.out.println("result: "+findWordsContaining(new String[]{"leet","code"},'e'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        // Approach 1
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].indexOf(x) >= 0) {
//                result.add(i);
//            }
//        }
        // Approach 2
        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }
}
