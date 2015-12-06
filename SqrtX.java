public class SqrtX{
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
         if(x == 1) {
             return 1;
         }
       
        
        int start = 0;
        int end = x;
        
        while(start < end) {
            
            int mid = start + (end - start) / 2;
            if(mid <= x / mid && mid+1 > x / (mid+1) ) {
                return mid;
            } else if(mid > x/mid) {
                end = mid;
            } else if(mid < x / mid){
                start = mid + 1;
            }
        }
        
        return start;
    }
}