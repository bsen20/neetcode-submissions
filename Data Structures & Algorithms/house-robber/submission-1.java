class Solution {
    int f(int[] nums,int ind,int[] dp){
        if(ind<0)
        return 0;
        if(ind == 0)
        return nums[0];
        if(dp[ind]!=-1)return dp[ind];
        //either rob or not rob
        int rob = 0 , notRob = 0;
        notRob = f(nums,ind-1,dp);
        rob = nums[ind] + f(nums,ind-2,dp);

        return dp[ind] = Math.max(rob,notRob);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return f(nums,n-1,dp);
    }
}
