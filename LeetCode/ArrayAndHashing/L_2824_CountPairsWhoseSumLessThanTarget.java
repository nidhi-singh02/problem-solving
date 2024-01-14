package LeetCode.ArrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L_2824_CountPairsWhoseSumLessThanTarget{

    public static void main(String[] args){
        List<Integer> input = new ArrayList<>(Arrays.asList(-1,1,2,3,2));
        int target = 2;
        System.out.println("ans: "+countPairs(input,target));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int pairs = 0;

        // Brute force approach - Use two loops
        // Time Complexity - O(n*n)
        // Space Complexity - O(1)
        for (int i=0; i < nums.size();i++){
            for(int j=i+1; j < nums.size();j++){
                if(nums.get(i) + nums.get(j) < target){
                    pairs++;
                }
            }
        }

        return pairs;
    }

}