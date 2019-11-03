/*
 * Traverse a given array. In each iteration, do:
 * 1. track min price from the traversed part. 
 * If current price < min price, then set the current price to be min price.
 * 2. Compare max profit and the difference between current price and min price. 
 * Set the max value to be max profit.
 * Finally return max profit.
 */
class Solution {
	public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int size = prices.length;
        
        // track index
        int i = 0;
        
        while(i < size){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            i++;
        }
        
        return maxProfit;
    }
}
