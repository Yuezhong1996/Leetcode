import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Solution solution = new Solution();
	  int[] nums = {1, 0, -1, 0, -2, 2};
	  int target = 0;
	  List<List<Integer>> result = solution.fourSum(nums, target);
	  System.out.print(result);
	}

}
