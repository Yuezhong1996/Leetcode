
class Solution {
	/**
	 * Initialize and declare currentSum to be 0 and sum to be minimum integer. The returned variable is sum.
	 * Use currentSum to keep track of cumulative sum of sub-array.
	 * 
	 * For each iteration:
	 * Obtain the larger value between nums[i] and currentSum + nums[i].
	 * Obtain the larger value between sum and currentSum.
	 * 
	 * @param nums
	 * @return sum
	 */
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int currentSum = 0;
        int sum = Integer.MIN_VALUE;
        
        for(int i = 0; i < size; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            sum = Math.max(sum, currentSum);
        }
        
        return sum;
    }
}