package LeetCode.ArrayAndHashing;

import java.util.*;

/* Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 
Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> seen = new HashMap<>();
        for (Integer element:nums){
            seen.put(element,seen.getOrDefault(element,0)+1);
        }
        
        List<Integer> allKeys = new ArrayList(seen.keySet());
        Collections.sort(allKeys,(a,b) -> seen.get(b) - seen.get(a)); 

        int[] result= new int[k];
        for (int i=0;i < k;i++){
             result[i] = allKeys.get(i);
        }
         
        return result;
    }
}


