class Solution {
    public int removeDuplicates(int[] nums) {
        int nextUniqueElementIndex = 0;
        int size = nums.length;
        
        if(size <= 1){
            return size;
        }
        
        for(int currentElement = 0; currentElement < size - 1; currentElement++){
            if(nums[currentElement] != nums[currentElement + 1]){
                nums[nextUniqueElementIndex] = nums[currentElement];
                nextUniqueElementIndex++;
            }
        }
        
        nums[nextUniqueElementIndex] = nums[size - 1];
        nextUniqueElementIndex++;
        
        return nextUniqueElementIndex;
    }
}