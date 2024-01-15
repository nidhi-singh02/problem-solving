package LeetCode.ArrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_1431_KidsWithGreatestNumberOfCandies {

    public static void main(String[] args){
        System.out.println("result: "+kidsWithCandies(new int[]{2,3,5,1,3},3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the kid having greatest number of candies
        // Add the extraCandies to each of the kid and see if it is equal to or greater than the greatest candies, if yes return true
        // else return false

//        int[] sortedCandies =  Arrays.copyOf(candies,candies.length);
//        Arrays.sort(sortedCandies);
//        int greatestCandy = sortedCandies[sortedCandies.length-1];
        int greatestCandy = Integer.MIN_VALUE;
        for( int candy : candies){
            greatestCandy = Math.max(candy,greatestCandy);
        }
        List<Boolean> kidsHavingGreatestCandies = new ArrayList<>();

        for (int candy : candies) {
            if (candy + extraCandies >= greatestCandy) {
                kidsHavingGreatestCandies.add(true);
            } else {
                kidsHavingGreatestCandies.add(false);
            }
        }
        return kidsHavingGreatestCandies;
    }
}
