class Solution {
    public int mySqrt(int x) {
        int lo = 0 , hi = x;
        int ans = -1;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if((long)mid*mid == x)
            return mid;
            if((long)mid*mid < x) {
                ans = mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
}