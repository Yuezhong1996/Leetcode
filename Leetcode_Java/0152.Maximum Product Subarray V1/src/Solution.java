
class Solution {
	/**
	 * In a given array nums, keep track of every combination of sub-array in this array.
     * Use start and end indices as starting and ending points of this sub-array.
     * Store the product of sub-array subArrayProduct.
     * End index should be equal to or after(greater than) start index. 
     * 
     * For each iteration:
     * When start and end indices point to the same index(start == end), subArrayProduct set to be nums[end].
     * Else subArrayProduct set to be subArrayProduct *= nums[end] to get cumulative product.
     * Obtain the greater number between product and subArrayProduct.
	 * 
	 * 
	 * @param nums
	 * @return product
	 */
    public int maxProduct(int[] nums) {
        int size = nums.length;
        int subArrayProduct = nums[0];
        int product = Integer.MIN_VALUE;
        
        for(int start = 0; start < size; start++){    
            for(int end = start; end < size; end++){
                if(start == end){
                    subArrayProduct = nums[end];
                }else{
                    subArrayProduct *= nums[end];
                }
                product = Math.max(product, subArrayProduct);
            }
        }
        
        return product;
    }
}