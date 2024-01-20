package LeetCode.ArrayAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L_1207_UniqueNumberOfOccurrences {
    public static void main(String[] args){
        System.out.println("result: "+uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        // Use Hashmap to store values(key) and their occurrences as value
//        Map<Integer,Integer> numbersVisited = new HashMap<>();
//
//        for (int j : arr) {
//            numbersVisited.put(j, numbersVisited.getOrDefault((j), 0) + 1);
//        }
//       int c= (int) numbersVisited.values().stream().distinct().count();
//        return c == numbersVisited.size();

        // Second approach:
        Map<Integer,Integer> numbersVisited = new HashMap<>();
        for (int j : arr) {
            numbersVisited.put(j, numbersVisited.getOrDefault((j), 0) + 1);
        }

        Set<Integer> set = new HashSet<>(numbersVisited.values());
        return set.size() == numbersVisited.size();
    }
}
