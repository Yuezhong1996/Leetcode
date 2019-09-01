import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            int front = i + 1;
            int end = nums.length - 1;
            
            while(front < end){
                if(nums[front] + nums[end] < 0 - nums[i]){
                    front++;
                }else if(nums[front] + nums[end] > 0 - nums[i]){
                    end--;
                }else{
                    List<Integer> threeSumList = new ArrayList<Integer>();
                
                    threeSumList.add(nums[i]);
                    threeSumList.add(nums[front]);
                    threeSumList.add(nums[end]);
                    
                    result.add(threeSumList);
                    
                    front++;
                    end--;
                }
            }
               
        }
        
        return result.stream().distinct().collect(Collectors.toList());
    }
}
