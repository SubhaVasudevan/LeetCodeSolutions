import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> returnResult = new ArrayList<List<Integer>>();
        
        //sort the numbers so they will be added in the List in ascending order
        Arrays.sort(nums);        

        //start adding the elements from the array to the existing sets    
        for(int i = 0 ; i < nums.length  ; i++) {
            
            //take a copy of the existing sets
            List<List<Integer>> temp = new ArrayList<List<Integer>>();
            for(List<Integer> a : returnResult) {
                
                //pass by value so you don't access the existing set
                temp.add(new ArrayList<Integer>(a));
            }
            
            //add the new number to the existing subsets
            for(List<Integer> a: temp) {
                a.add(nums[i]) ;
            }
            
            
            //add a singleton set
            List<Integer> indivudual = new ArrayList<Integer>();
            indivudual.add(nums[i]);
            temp.add(indivudual);
            
            //add all the new subsets to the main set
            returnResult.addAll(temp);
        }
        
        //add an empty set
        List<Integer> subset = new ArrayList<Integer>();
        returnResult.add(subset);
        
        return returnResult;
        
    }
}