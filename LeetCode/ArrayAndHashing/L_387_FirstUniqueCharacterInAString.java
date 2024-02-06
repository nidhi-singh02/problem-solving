package LeetCode.ArrayAndHashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class L_387_FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println("result: "+firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        char[] charArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int firstUniqIndex = -1;
        // Store character and index if unique, if not unique - insert value as -1
        for (int i = 0; i < charArr.length; i++) {
            if (map.containsKey(charArr[i])) {
                // If duplicate, insert value as -1 (-1 cannot be index)
                map.put(charArr[i], -1);
            } else {
                // First time, unique
                map.put(charArr[i], i);
            }
        }
        // Get the value from map other than -1, which is smallest
//         java.util.Optional<Map.Entry<Character, Integer>> entry =
//         map.entrySet().stream().filter(m -> m.getValue() != -1)
//         .min(Map.Entry.comparingByValue());
//         if (entry.isPresent()) {
//         firstUniqIndex = entry.get().getValue();
//         }

        if (map.entrySet().stream().anyMatch(m -> m.getValue() != -1)) {
            Map.Entry<Character, Integer> e = Collections.min(
                    map.entrySet().stream().filter(m -> m.getValue() != -1).collect(Collectors.toList()),
                    Map.Entry.comparingByValue());
            firstUniqIndex = e.getValue();
        }

        return firstUniqIndex;

    }
}
