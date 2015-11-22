/*Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]*/


public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        
		
		//similar to the subset problem, but hashset is used to avoid duplicates
        HashSet<List<Integer>> returnSet = new HashSet<List<Integer>>();
        
        for(int i = 0 ; i < nums.length  ; i++) {
            
            List<List<Integer>> temp = new ArrayList<List<Integer>>();
            
            for(List<Integer> a : returnSet) {
                temp.add(new ArrayList<Integer>(a));
            }
            
            for(List<Integer> a : temp) {
                a.add(nums[i]);
            }
            
            List<Integer> single = new ArrayList<Integer> ();
            single.add(nums[i]);
            temp.add(single);
            returnSet.addAll(temp);
        }
        
        List<Integer> empty = new ArrayList<Integer>();
        returnSet.add(empty);
        
        
        List<List<Integer>> ireturn = new ArrayList<List<Integer>>(returnSet);
        return ireturn;
        
    }
}