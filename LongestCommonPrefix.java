/*Write a function to find the longest common prefix string amongst an array of strings.*/

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

		//check if it empty or null
        if(strs == null || strs.length == 0) {
            return "";
        }
        
		
		//find the max length of the prefix that is possible
		//the maximum possible length of the prefix is the length of the shortest string
        int minLength = Integer.MAX_VALUE;
        for(int i = 0  ; i < strs.length ; i++) {
            if(minLength > strs[i].length()) {
                minLength = strs[i].length();
            }
        }
        
		
		//if the max length of prefix is 0 return empty string
        if(minLength == 0) {
            return "";
        }
        
		
		//check whether each of the characters is same
        char charToCheck;
        for(int i = 0 ; i < minLength  ; i++) {
            charToCheck = strs[0].charAt(i);
            
            //for every string check whether the specific character is present
            for(int j = 0 ; j < strs.length ; j++ ) {
                if(charToCheck != strs[j].charAt(i)){
                    return strs[j].substring(0,i);
                }
            }
        }
        
        return strs[0].substring(0,minLength);
    }
}