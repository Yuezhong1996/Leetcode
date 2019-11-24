
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        
        int[] result = solution.productExceptSelf(nums);
        int size = result.length;
        
        for(int i = 0; i < size; i++){
        	if(i == size - 1){
        		System.out.print(result[i]);
        	}else{
        		System.out.print(result[i] + ", ");
        	}
        }
	}

}
