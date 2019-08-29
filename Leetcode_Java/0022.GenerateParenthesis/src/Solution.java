import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        
        int numberOfLeftAdded = 0;
        int numberOfRightAdded = 0;
        String temp = "";
        
        return dfsBacktrack(result, temp, numberOfLeftAdded, numberOfRightAdded, n);
    }
    
    private List<String> dfsBacktrack(List<String> result, String temp, int left, int right, int n){
        if(left == n && right == n){
            result.add(temp);
        }
        
        if(left < n){
            dfsBacktrack(result, temp + "(", left + 1, right, n);
        }
        
        if(right < left){
            dfsBacktrack(result, temp + ")", left, right + 1, n);
        }
        
        return result;
    }
}