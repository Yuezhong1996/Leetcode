import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int difference = Integer.MAX_VALUE;
        int sum = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            int front = i + 1;
            int end = nums.length - 1;
            
            while(front < end){
                if(nums[front] + nums[end] < target - nums[i]){
                    if(target - (nums[i] + nums[front] + nums[end]) < difference){
                        difference = target - nums[i] - nums[front]  - nums[end];
                        sum = nums[i] + nums[front] + nums[end];
                    }
                    
                    front++;
                }else if(nums[front] + nums[end] > target - nums[i]){
                    if(nums[i] + nums[front] + nums[end] - target < difference){
                        difference = nums[i] + nums[front] + nums[end] - target;
                        sum = nums[i] + nums[front] + nums[end];
                    }
                    
                    end--;
                }else{
                    return target;
                }
            }
        }
        
        return sum;
    }
}