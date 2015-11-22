/* Follow up for "Find Minimum in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array may contain duplicates.*/


public class MinimumInRoatedSortedArray2 {
    public int findMin(int[] nums) {
        
        //if there is only a single element
        if(nums.length == 1) {
            return nums[0];
        }
        
        //if the current number is bigger than the next number, the the next number is the largest number
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            if(nums[i] > nums[i+1]) {
                return nums[i+1];
            }
        }
        
        //if the boave scenario never occurs the first number is the smallest number
        return nums[0];
    }
}