
class Solution {
	public int maxProfit(int[] prices) {
        int size = prices.length;
        int maxProfit = 0;
        
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        
        return maxProfit;
    }
}
