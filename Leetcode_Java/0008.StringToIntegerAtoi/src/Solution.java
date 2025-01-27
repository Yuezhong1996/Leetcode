
class Solution {
    public int myAtoi(String str) {
        int sign = 1;
        int count = 0;
        int result = 0;
        
        str = str.trim();
        
        if (str.isEmpty()){
        	return 0;
        }else if (str.charAt(count) == '-') { 
        	count++; 
        	sign = -1; 
        }else if (str.charAt(count) == '+') { 
        	count++; 
        }
        
        //When it is not overflow
        while (count < str.length() && Character.isDigit(str.charAt(count))) {
            int differenceOfAscii = str.charAt(count) - '0';
            if (result > (Integer.MAX_VALUE - differenceOfAscii) / 10) {
            	return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + differenceOfAscii;
            count++;
        }
        
        return result * sign;
    }
}