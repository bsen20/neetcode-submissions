class Solution {
    int res = 0;
    void f(int[] nums,int ind,List<Integer>temp){
        if(ind == nums.length)
        {
            int x = 0;
            for(int i : temp){
                x = x^i;
            }
            res+=x;
            return;
        }
        //skip current index
        f(nums,ind+1,temp);
        temp.add(nums[ind]);
        f(nums,ind+1,temp);
        temp.removeLast();
    }
    public int subsetXORSum(int[] nums) {
        f(nums,0,new ArrayList<>());

        return res;
    }
}