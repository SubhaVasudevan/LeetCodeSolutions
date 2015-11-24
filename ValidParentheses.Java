import java.util.*;
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        
        //add all apirs to the hashtable
        Hashtable<Character, Character> ht = new Hashtable<Character, Character>();
        ht.put('(',')');
        ht.put('{','}');
        ht.put('[',']');
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            
            //check if it is a opening braces if yes add to hashtable
            if(ht.containsKey(c)) {
                stack.push(c);
            } else {
                
                //if it is the closing braces check whether the pair is inside the stack
                if(stack.size() > 0 && ht.get(stack.peek()) == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        //check if there are unpaired open braces
        if(!stack.empty()) {
            return false;
        }
        return true;
    }
}