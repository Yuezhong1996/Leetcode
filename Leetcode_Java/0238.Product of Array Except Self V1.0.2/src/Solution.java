
class Solution {
	/**
	 * 
	 * @param nums
	 * @return result
	 * 
	 * Initialize an empty array result[]. Store the product of all integers on the left of [exception].
     * Start the first loop.
     * If exception == 0, then result[exception] = 1. (Avoid index out of range)
     * result[exception] is the product of result[exception - 1] * nums[exception - 1].
     * Done with the first loop.
     * Initialize and declare an integer "right" to keep track the product of all integers on the right of 
     * [exception].
     * Start the second loop.
     * For each iteration, update result[exception] as result[exception] * right, and then
     * update right as right * nums[i].
     * Done with the second loop.
     * Now, the result[] array is the returned value.
	 */
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        
        for(int exception = 0; exception < size; exception++){
            if(exception == 0){
                result[exception] = 1;
            }else{
                result[exception] = result[exception - 1] * nums[exception - 1];    
            }
        }
        
        int right = 1;
        
        for(int exception = size - 1; exception >= 0; exception--){
            result[exception] *= right;
            right *= nums[exception];
        }
        
        return result;
    }
}