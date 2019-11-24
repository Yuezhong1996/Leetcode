/**
 * 
 * @author YuezhongYan
 * 
 * Declare three arrays, left[], right[], and product[]. Do iterations twice. 
 * First time, traverse from left to right. Calculate each product on the left of the exception and 
 * store these products to left[]. If exception is 0, then left[exception] is 1. Else 
 * left[exception] is nums[exception - 1] * left[exception - 1].
 * Second time, traverse from right to left. Calculate each product on the right of the exception and 
 * store these products to right[]. If exception is (size of nums) - 1, then right[exception] is 1. Else 
 * right[exception] is nums[exception + 1] * right[exception + 1].
 * Finally multiply left[i] and right[i] and store it to product[i].
 * 
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] left = new int[size];
        int[] right = new int[size];
        int[] product = new int[size];
        
        for(int exception = 0; exception < size; exception++){
            if(exception == 0){
                left[exception] = 1;
            }else{
                left[exception] = nums[exception - 1] * left[exception - 1];
            }
        }
        
        for(int exception = size - 1; exception >= 0; exception--){
            if(exception == size - 1){
                right[exception] = 1;
            }else{
                right[exception] = nums[exception + 1] * right[exception + 1];
            }
        }
        
        for(int i = 0; i < size; i++){
            product[i] = left[i] * right[i];
        }
        
        return product;
    }
}