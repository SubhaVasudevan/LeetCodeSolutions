import java.util.*;

public class LargeNumber{
    public String largestNumber(int[] nums) {
        int size = nums.length;
        
        String[] num = new String[size];
        
        for(int i = 0 ; i < size ; i++) {
            num[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(num, new MaxComparator());
        
        String result ="";
        
        for(int i = 0 ;i <  size ; i++) {
            result = result + num[i];
        }
        
        
        while(result.charAt(0) == '0' && result.length() > 1) {
            result = result.substring(1,result.length());
        }
        
        return result;
        
    }
    
    class MaxComparator implements Comparator<String>{
        
        @Override
        public int compare(String s1, String s2) {
            String lr = s1 + s2;
            String rl = s2 + s1;
            
            return -(lr.compareTo(rl));
        }
    }
}