package LeetCode.ArrayAndHashing;

import java.util.*;
import java.util.stream.Collectors;

public class L_1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        System.out.println("result: "+ Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] result = new int[nums.length];
//
//        for(int i=0;i < nums.length;i++){
//            int smallerNums = 0;
//            for(int j=0; j < nums.length;j++){
//                if(nums[i] > nums[j] && i != j){
//                    smallerNums++;
//                }
//
//            }
//            result[i] =smallerNums;
//        }
//
//        return result;

        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] result = new int[nums.length];
        int i=0;
        for(int num:nums){
            List<Integer> allNums = map.entrySet().stream().filter(e -> e.getKey().compareTo(num) < 0).map(Map.Entry::getValue).collect(Collectors.toList());
            int sum = 0;
            for (int n : allNums) {
                sum = sum + n;
            }
            result[i] = sum;
            i++;
        }

        return result;

    }
}
