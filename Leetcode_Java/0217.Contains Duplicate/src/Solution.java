import java.util.HashMap;

/**
* use hashmap to remove duplicates from origin.
* compare size of map and that of origin.
* if sizes are the same, then distinct, otherwise duplicates contained.
*/
class Solution {
	public boolean containsDuplicate(int[] nums) {
        int originSize = nums.length;
        HashMap<Integer, Integer> mapWithDuplicateRemoved = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < originSize; i++){
            mapWithDuplicateRemoved.put(nums[i], i);
        }
        
        if(mapWithDuplicateRemoved.size() == originSize){
            return false;
        }else{
            return true;
        }
    }
}
