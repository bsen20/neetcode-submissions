class Solution {
    void f(int[] nums,int ind,List<Integer>temp,List<List<Integer>> ans){
        if(ind == nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        //skip current index
        f(nums,ind+1,temp,ans);
        temp.add(nums[ind]);
        f(nums,ind+1,temp,ans);
        temp.removeLast();
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        f(nums,0,temp,ans);
        return ans;
    }
}
