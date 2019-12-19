
class Solution {
    /**
     * In a given array nums, keep track of every combination of sub-array in this array.
     * Use start and end indices as starting and ending points of this sub-array.
     * Store the sum of sub-array subArraySum. 
     * 
     * For each iteration:
     * When end index increments(sub-array extends towards right), add new elements to subArraySum.
     * When start index increments(sub-array shrinks towards right), set subArraySum to be 0.
     * Compare sum and subArray sum and obtain the larger one.
     * 
     * @param nums
     * @return sum
     */
	public int maxSubArray(int[] nums) {
        int size = nums.length;
        int subArraySum = 0;
        int sum = Integer.MIN_VALUE;
        
        for(int start = 0; start < size; start++){
            subArraySum = 0;
            
            for(int end = start; end < size; end++){
                subArraySum += nums[end];
                
                if(sum < subArraySum){
                    sum = subArraySum;
                }
            }
        }
        
        return sum;
    }
}