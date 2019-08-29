import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> numberMappedToCharacter = new HashMap<>();
        
        numberMappedToCharacter.put('2', "abc");
        numberMappedToCharacter.put('3', "def");
        numberMappedToCharacter.put('4', "ghi");
        numberMappedToCharacter.put('5', "jkl");
        numberMappedToCharacter.put('6', "mno");
        numberMappedToCharacter.put('7', "pqrs");
        numberMappedToCharacter.put('8', "tuv");
        numberMappedToCharacter.put('9', "wxyz");
        
        List<String> result = new ArrayList<>();
        
        if(digits.length() == 0 || digits == "1"){
            return result;
        }
        
        result.add("");
        
        /* Traverse input string*/
        for(int i = 0; i < digits.length(); i++){
            String value = numberMappedToCharacter.get(digits.charAt(i));
            List<String> listToBeAppended = new ArrayList<>();
            
            /* 
             * j is the index of result list string
             * k is the index of character from the value string from hashmap
             * String builder appends each character being traversed to itself
             */
            for(int j = 0; j < result.size(); j++){
                for(int k = 0; k < value.length(); k++){
                    StringBuilder sb = new StringBuilder(result.get(j));
                    String characterToBeAdded = sb.append(value.charAt(k)).toString();
                    listToBeAppended.add(characterToBeAdded);
                }
            }
            result.clear();
            result.addAll(listToBeAppended);
        }
        
        return result;
    }
}