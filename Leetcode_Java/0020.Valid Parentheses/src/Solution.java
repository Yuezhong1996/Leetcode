import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
        		stack.push(s.charAt(i));
        	}
        	
        	if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
        		if(stack.empty()){
                    return false;
                }
                
                char peekCharacter = stack.peek();
                
                if((peekCharacter == '(' && s.charAt(i) == ')') || 
                   (peekCharacter == '{' && s.charAt(i) == '}') || 
                   (peekCharacter == '[' && s.charAt(i) == ']')){
                    stack.pop();
                }else{
                    return false;
                }
            
        	}
        }
        
        return stack.empty();
    }
}
