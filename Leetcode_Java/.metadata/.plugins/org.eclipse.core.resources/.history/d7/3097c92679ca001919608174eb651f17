import java.util.HashMap;

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmapNums = new HashMap<Integer, Integer>();
        
        //add every element to hashmap
        for(int i = 0; i < nums.length; i++){
            hashmapNums.put(nums[i], i);
        }
        
        //use complement = target - nums[i] to check if nums[i] and complement are in the same map
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            if(hashmapNums.containsKey(complement) && hashmapNums.get(complement) != i){
                return new int[] {i, hashmapNums.get(complement)};
            }
        }
        
        throw new NullPointerException();
    }
}