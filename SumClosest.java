/*Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).*/

import java.util.Arrays;

public class SumClosest{
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int returnSum = 0;
        
        
        //sort the array in ascending order
        Arrays.sort(nums);
        
        //for every number in the array try to find the other two number that provide a sum close to the target
        for(int  i = 0 ; i < nums.length ; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
            
                //if the sum is the required target return it
                if(sum == target) {
                    return sum;
                }
            
                //if the sum is not the required target find the difference between the sum and target
                int diff = Math.abs(sum - target);
            
                ////check if it is the minimum difference found till now
                if(diff < minDiff) {
                    minDiff = diff;
                    returnSum = sum;
                }
                
                
                //if the sum is larger move to smaller numbers
                //if the sum is smaller move to larger numbers
                if(sum > target) {
                    k--;
                }else{
                    j++;
                }
            }
        }
        
        return returnSum;  
    }

}
