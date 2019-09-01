import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = solution.threeSum(nums);
		System.out.print(result);
	}

}
