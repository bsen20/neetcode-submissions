class Solution {
    public boolean isPossible(int[] weights, int days, int cap) {
        int d = 1;
        int curr = 0;

        for (int w : weights) {
            if (curr + w <= cap) {
                curr += w;
            } else {
                d++;
                curr = w;
            }
        }

        return d <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int min = weights[0];
        int max = 0;

        for(int i =0;i<weights.length;i++){
            min = Math.max(weights[i],min);
            max+=weights[i];
        }
        int w = max;
        while(min<=max){
            int mid = min + (max-min)/2;
            if(isPossible(weights,days,mid)){
                w = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return w;

    }
}