package LeetCode.BinarySearch;


import java.util.Arrays;
//We can arrive at a basic conclusion that piles.length <= h
// because, if let's say, there are 6 piles in an array and h = 4,
// then Koko will only be able to eat 4 piles at max (because of the 1 pile/hour rule),
// and hence all the bananas will not be consumed.
// Thus, the length of the array piles[]is always going to be less than or equal to h.

//The values of k can range from minimum = 1 to maximum =max(piles[]),
// because if we can eat the maximum number of bananas in 1 hour, then we can eat every other pile,
// which contains fewer bananas, in exactly 1 hour as well.
// But we have to find the minimum number of k from the range of k.

//  For example, in piles = [3,6,7,11], h = 8 the values of k will range from k = [1 ... 11]
//One solution to the problem can be to iterate through all the values of k in its range
// but that would be of the time complexity O(max(piles[])∗p)
// but we can reduce it to O(log(max(piles[]))∗p) by not iterating and
// applying the concept of Binary Search to the range of k.

public class L_875_KokoEatingBananas {
    public static void main(String[] args){
        int[] input = {3,6,7,11};
        int result = minEatingSpeed(input,8);
        System.out.println("result: "+result);

    }
        public static int minEatingSpeed(int[] piles, int h) {
            Arrays.sort(piles);
            int l =1;
            int r = piles[piles.length-1];;
            int res = r;

            while(l <= r){
                int k = (l+r)/2;
                int hours = 0;
                for(int pile:piles){
                       hours+= (int) Math.ceil((double) pile /k);
//                    if(pile % k == 0){
//                        hours += (pile / k);
//                    }else{
//                        hours += ((pile / k)+1);
//                    }
                }

                if(hours <= h){
                    res = Math.min(res,k);
                    r = k-1;
                }else{
                    l = k+1;
                }
            }
            return res;
        }
    }


