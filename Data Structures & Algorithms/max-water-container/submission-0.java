class Solution {
    public int maxArea(int[] heights) {
        int lo = 0 , hi = heights.length - 1;
        int maxWater = 0;
        while(lo < hi){
            int minH = Math.min(heights[lo],heights[hi]);
            int water = (hi-lo)*minH;
            maxWater = Math.max(water,maxWater);
            if(heights[lo]<heights[hi])
                lo++;
            else
                hi--;    
        }
        return maxWater;

    }
}
