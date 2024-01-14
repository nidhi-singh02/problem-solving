package LeetCode.ArrayAndHashing;

import java.util.*;

public class L_49_GroupAnagrams {

    public static void main(String[] args){
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println("result"+result);
    }

public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();

        for(String s:strs){
           char[] charArray = s.toCharArray();
           Arrays.sort(charArray);
           String StringElem = String.valueOf(charArray);

           if (result.containsKey(StringElem)) {
              List<String> existingValue = result.get(StringElem);
               existingValue.add(s);
              result.put(StringElem,new ArrayList<>(existingValue));

           }else{
               result.put(StringElem,new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(result.values());
}
}
