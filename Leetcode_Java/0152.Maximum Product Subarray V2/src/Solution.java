
class Solution {
	/**
	 * Define maxValue and minValue that represent maximum and minimum product values in a sub-array.
	 * Go through the given array nums from left to right.
	 * Store the maxValue and minValue till i-th index of the given array.
	 * Now, if the i-th element(nums[i]) is negative, swap maxValue and minValue. 
	 * The maxValue will become the minimum.
	 * Multiply maxValue with negative number(nums[i]). Assign the product to maxValue.
	 * Compare maxValue with minValue.
	 * The maxValue and minValue depend on the current element(nums[i]) or 
	 * the product of current element(nums[i]) and the previous maxValue(nums[i], maxValue * nums[i]) and 
	 * minValue(nums[i], minValue * nums[i]) respectively.
	 * maxValue and minValue Example: [2, 3, -2, 4].
	 * When nums[i] == 3, maxValue is 6(which is 2 * 3) and minValue is 2.
	 * 
	 * For each iteration:
	 * if i-th element is negative(nums[i] < 0), then swap maxValue and minValue.
	 * Obtain maxValue, which is the greater value between nums[i] and maxValue * nums[i].
	 * Obtain minValue, which is the smaller value between nums[i] and minValue * nums[i].
	 * Retrieve maxProduct, which is the greater value between maxProduct and maxValue.
	 * 
	 * @param nums
	 * @return maxProduct
	 */
    public int maxProduct(int[] nums) {
        int size = nums.length;
        int maxValue = nums[0];
        int minValue = nums[0];
        int maxProduct = nums[0];
        
        for(int i = 1; i < size; i++){
            if(nums[i] < 0){
                int temp = maxValue;
                maxValue = minValue;
                minValue = temp;
            }
            
            maxValue = Math.max(nums[i], maxValue * nums[i]);
            minValue = Math.min(nums[i], minValue * nums[i]);
            
            maxProduct = Math.max(maxProduct, maxValue);
        }
        
        return maxProduct;
    }
}