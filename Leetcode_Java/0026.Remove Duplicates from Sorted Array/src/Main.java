
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        int length = solution.removeDuplicates(nums);
        System.out.println(length);
        
        for(int i = 0; i < nums.length; i++){
        	System.out.print(nums[i]);
        }
	}

}
