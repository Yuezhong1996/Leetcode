
class Solution {
	public boolean isPalindrome(int x) {
        String leftToRight = String.valueOf(x);
        String rightToLeft = new StringBuffer(leftToRight).reverse().toString();
        
        return leftToRight.equals(rightToLeft);
    }
}
