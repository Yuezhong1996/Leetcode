class Solution {
    public int removeElement(int[] nums, int val) {
        int pre = 0;
        
        for(int currentElement = 0; currentElement < nums.length; currentElement++){
            if(nums[currentElement] != val){
                nums[pre] = nums[currentElement];
                pre++;
            }
        }
        
        return pre;
    }
}