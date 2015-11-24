public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, k, 0, nums.length - 1);
    }
    
    private int quickSelect(int[] num, int target, int start, int end) {
        int pivot = end;
        int left = start;
        int right = end - 1;
        
        
        /////until the pointers overlap
        while(left <= right) {
            if(num[left] > num[pivot]) {
                swap(left, right, num);
                right--;
            } else {
                left++;
            }
        }
        
        
        //sbstitute the pivot to the right position
        swap(left , pivot, num);
        
        int pivotOrder = num.length - left;
        if(pivotOrder == target) {
            return num[left];
        } else {
            
            //if the order is bigger we have not still reached the bigger target. so search to the right
            if(pivotOrder > target) {
                return quickSelect(num, target, left + 1, end);
                //if the order is smaller search to the left since we are looking for the kth biggest element
            } else {
                return quickSelect(num, target, start, left - 1);
            }
        }
    }
    
    private void swap(int i ,  int j ,  int[] num) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}