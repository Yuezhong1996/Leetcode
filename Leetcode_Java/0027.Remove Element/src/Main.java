
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int length = solution.removeElement(nums, val);
        
        System.out.println(length);
        
        for(int i = 0; i < length; i++){
        	System.out.print(nums[i]);
        }
	}

}
