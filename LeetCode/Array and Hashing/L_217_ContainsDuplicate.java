import java.util.HashMap;
import java.util.Map;

public class L_217_ContainsDuplicate {

        public boolean containsDuplicate(int[] nums) {
            // First approach
            // Sort the array, so that same element cames adjacent
            // Then traverse the array and see if two adjacent elements are same
            // If above is yes, return true. Else false
            // Time Complexity - O(nlogn)
            // Auxiliary space - O(1)
            // Arrays.sort(nums);

            // for(int i=0;i<nums.length-1;i++){
            //     if(nums[i] == nums[i+1]){
            //         return true;
            //     }
            // }
            // return false;

            // Second approach
            // Traverse the array and store it in a HashMap as key as element
            // and value as 1 for first element
            // Whenever element is encountered, check if it exists in map, if it does
            // that means duplicate has occured, return true
            // Else, keep on transerving and if we reached the end of the loop
            // there is no duplicate, return false
            // Time Complexity - O(n)
            // Auxiliary Space - O(n)
            Map<Integer,Integer> elementsVisited = new HashMap<>();
            for(int elem : nums){
                if  (elementsVisited.containsKey(elem)){
                    return true;
                }
                elementsVisited.put(elem,1);
            }
            return false;
        }
    }
