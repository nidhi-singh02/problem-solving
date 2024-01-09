package LeetCode.SlidingWindow;

public class L_121_BestTimeToBuyAndSellStock {
        public int maxProfit(int[] prices) {
            // Traverse the array, at every element check the elements to right of it
            // as sellig has to be in the future
            // For every element, find the element greater than itself.
            // Subtract that elememt from the element we are traversing
            // Keep on storing the profit and find the max profit

            // Time Complexity - O(n*n) resulting in TLE on tescase 201 out of 212
            // int maxProfit = 0;
            // for(int i=0;i < prices.length;i++){
            //     for(int j= i+1; j < prices.length;j++){
            //         if(prices[j] > prices[i]){
            //             int currentProfit = prices[j]-prices[i];
            //             maxProfit = Math.max(maxProfit,currentProfit);
            //         }
            //     }
            // }
            // return maxProfit;

            // Time complexity - O(n)
            // Use two pointer approach

            int l=0;
            int r=l+1;
            int maxProfit = 0;

            while(r < prices.length){
                if(prices[l] > prices[r]){
                    l=r;
                }else if (prices[l] < prices[r]){
                    // There are two elements and both of them are equal like [6,6]
                    maxProfit = Math.max(maxProfit, prices[r]-prices[l]);
                }
                r++;
            }
            return maxProfit;

        }
}

