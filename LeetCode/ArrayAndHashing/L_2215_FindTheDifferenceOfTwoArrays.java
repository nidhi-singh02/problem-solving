package LeetCode.ArrayAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class L_2215_FindTheDifferenceOfTwoArrays {
    public static void main(String[] args){
        System.out.println("result: "+findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use HashMap with key as number and value as occurring in which array

        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int num1: nums1){
            hashMap.put(num1,0); // if duplicate key found it will override the value
        }

        for(int num2:nums2){
            if(!hashMap.containsKey(num2)){
                hashMap.put(num2,1);
            }else if(hashMap.containsKey(num2) && hashMap.get(num2) == 0){
                hashMap.put(num2,99);
            }
        }

        System.out.println("map: "+hashMap);
        List<List<Integer>> answer = new ArrayList<>();
        hashMap.

        answer.add(hashMap.entrySet().stream().filter(e -> e.getValue().equals(0)).map( Map.Entry::getKey).collect(Collectors.toList()));
        answer.add(hashMap.entrySet().stream().filter(e -> e.getValue().equals(1)).map( Map.Entry::getKey).collect(Collectors.toList()));

//        List<Map.Entry<Integer,Integer>> answer1 = hashMap.entrySet().stream().filter(e -> e.getValue().equals(1)).collect(Collectors.toList());
//
//        answer.add(answer0.stream().map(e -> e.getKey()).collect(Collectors.toList()));
//        answer.add(answer1.stream().map(Map.Entry::getKey).collect(Collectors.toList()));
        return  answer;
    }
}
