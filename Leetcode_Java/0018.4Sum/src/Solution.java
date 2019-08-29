import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        int size = nums.length;
        
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                int front = j + 1;
                int end = size - 1;
                
                while(front < end){
                    int sum = nums[i] + nums[j] + nums[front] + nums[end];
                    
                    if(sum < target){
                        front++;
                    }else if(sum > target){
                        end--;
                    }else{
                        List<Integer> subList = new ArrayList<>();
                        
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[front]);
                        subList.add(nums[end]);
                        
                        result.add(subList);
                        
                        front++;
                        end--;
                    }
                }
                
            }
        }
        
        return result.stream().distinct().collect(Collectors.toList());
    }
}