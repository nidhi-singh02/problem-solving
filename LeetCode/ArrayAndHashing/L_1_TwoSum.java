package LeetCode.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class L_1_TwoSum {
        public int[] twoSum(int[] nums, int target) {
            // First approach : Traverse the array
            // Take first element, subtract it from target, need to search that element
            // in the array, if found, capture the indexes
            // Exactly one solution
            // Time Complexity - O(n*n)
            // Space complexity - O(2)

            int[] result = new int[2];
            // for (int i = 0; i < nums.length - 1; i++) {
            //     for (int j = i + 1; j < nums.length; j++) {
            //         if (target - nums[i] == nums[j]) {
            //             result[0] = i;
            //             result[1] = j;
            //             return result;
            //         }
            //     }
            // }
            // return result;

            // Second approach :
            // Use HashMap to store the elements of array
            // key is the element of the array
            // and value is the index of the array

            Map<Integer,Integer> numsSeen = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                numsSeen.put(nums[i],i);
            }

            for(int i = 0; i < nums.length; i++){
                int SecondNum = target - nums[i];
                if(numsSeen.containsKey(SecondNum) && i != numsSeen.get(SecondNum)){
                    result[0] = i;
                    result[1] = numsSeen.get(SecondNum);
                    return result;
                }
            }

            return result;
        }
    }

