import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInt = new HashMap<Character, Integer>();
        
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
        
        int storedNum = romanToInt.get(s.charAt(s.length() - 1));
        
        for(int i = s.length() - 2; i >= 0; i--){
            if(romanToInt.get(s.charAt(i)) >= romanToInt.get(s.charAt(i + 1))){
                storedNum += romanToInt.get(s.charAt(i));
            }else{
                storedNum -= romanToInt.get(s.charAt(i));
            }
        }
        
        return storedNum;
    }
}