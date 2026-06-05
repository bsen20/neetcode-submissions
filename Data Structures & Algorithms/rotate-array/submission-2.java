class Solution {
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =temp;
    }
    private void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int i = 0 ,j = nums.length - 1;
        int n = nums.length;
        k = k%n;
        reverse(nums,i,n-k-1);
        reverse(nums,n-k,j);
        reverse(nums,0,n-1);
    }
}