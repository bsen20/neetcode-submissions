class Solution {
    private void f(int[] nums,int k,int target,List<List<Integer>>ans){
        int i = k+1, j = nums.length - 1;
        while(i<j){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum > target){
                j--;
            }
            else if(sum < target){
                i++;
            }else{
                ans.add(Arrays.asList(nums[k],nums[i],nums[j]));
                i++;
                j--;
                while(i<j && nums[i]==nums[i-1])i++;
                while(i<j && nums[j] == nums[j+1])j--;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int k = 0;k<nums.length-2;k++){
            if(nums[k]>0)break;
            if(k==0 || nums[k] !=nums[k-1])
            f(nums,k,0,ans);
        }
        return ans;
        
    }
}
