package LeetCode.ArrayAndHashing;

import java.util.*;
import java.util.stream.Collectors;

public class L_2215_FindTheDifferenceOfTwoArrays {
    public static void main(String[] args){
        System.out.println("result: "+findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use HashMap with key as number and value as occurring in which array
//
//        Map<Integer,Integer> hashMap = new HashMap<>();
//
//        for(int num1: nums1){
//            hashMap.put(num1,0); // if duplicate key found it will override the value
//        }
//
//        for(int num2:nums2){
//            if(!hashMap.containsKey(num2)){
//                hashMap.put(num2,1);
//            }else if(hashMap.containsKey(num2) && hashMap.get(num2) == 0){
//                hashMap.put(num2,99);
//            }
//        }
//
//        System.out.println("map: "+hashMap);
//        List<List<Integer>> answer = new ArrayList<>();
//
//        answer.add(hashMap.entrySet().stream().filter(e -> e.getValue().equals(0)).map( Map.Entry::getKey).collect(Collectors.toList()));
//        answer.add(hashMap.entrySet().stream().filter(e -> e.getValue().equals(1)).map( Map.Entry::getKey).collect(Collectors.toList()));
//
//        return  answer;

       return Arrays.asList(getElementsOnlyInOneList(nums1,nums2),
        getElementsOnlyInOneList(nums2,nums1));

    }

    private static List<Integer> getElementsOnlyInOneList(int[] nums1, int[] nums2){
        Set<Integer> numberOnlyIn1 = new HashSet<>();
        Set<Integer> existsInNums2 = new HashSet<>();

        for(int n2: nums2){
            existsInNums2.add(n2);
        }

        for(int n1: nums1){
            if (!existsInNums2.contains(n1)){
                numberOnlyIn1.add(n1);
            }
        }
       return new ArrayList<>(numberOnlyIn1);
    }


}
