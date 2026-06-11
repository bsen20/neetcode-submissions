class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxJump = 0;
        for(int i =0;i<n;i++){
            if(maxJump >= n-1)
            return true;
            if(maxJump == i && nums[i] == 0)
            return false;

            maxJump = Math.max(maxJump,i+nums[i]);
        }
        return maxJump>=n-1 ?true:false;
    }
}
