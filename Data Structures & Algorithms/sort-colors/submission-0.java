class Solution {
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0 , k = 0 , j = nums.length-1;
        while(k<=j){
            if(nums[k] == 1){
                k= k+1;
            }else if(nums[k] == 2){
                swap(nums,k,j);
                j = j-1;
            }else{
                swap(nums,i,k);
                i= i+1;
                k=k+1;
            }
        }
    }
}