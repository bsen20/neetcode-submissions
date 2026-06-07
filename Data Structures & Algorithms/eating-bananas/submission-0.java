class Solution {
    private int calc(int[] piles,int k){
        int ans = 0;
        for(int i =0;i<piles.length;i++){
            int c = piles[i]/k;
            int m = piles[i]%k;
            ans+=c+(m==0?0:1);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int j = 0;
        for(int i =0;i<piles.length;i++)
        j = Math.max(piles[i],j);
        int i = 1;
        int ans = j;
        while(i<=j){
            int mid = i + (j-i)/2;
            int c = calc(piles,mid);

            if(c<=h){
                ans = mid;
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return ans;
    }
}
