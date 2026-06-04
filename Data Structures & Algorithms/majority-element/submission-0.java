class Solution {
    public int majorityElement(int[] nums) {
        int majorElm = nums[0];
        int count = 1;
        for(int i =1;i<nums.length;i++){
            if(majorElm == nums[i]){
                count++;
            }else{
                count--;
                if(count == 0){
                    majorElm = nums[i];
                    count = 1;
                }
            }
        }
        return majorElm;
    }
}