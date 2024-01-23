package LeetCode.ArrayAndHashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class L_136_SingleNumber {
    public static void main(String[] args) {
        System.out.println("result: "+singleNumber(new int[]{2,2,1,1,3,3,4}));
    }
    public static int singleNumber(int[] nums) {
        // Use HashMap - O(n) space complexity
        // We need constant extra space
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }
        Integer singleElement = hashMap.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
                .collect(Collectors.toList()).get(0);

        return singleElement;

        // Second approach - XOR operator, Bitwise manipulation

    }
}
