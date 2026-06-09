class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int nums1 = -1,nums2 = -1, cnt1 = 0,cnt2 = 0;
        int n = nums.length;

        for(int num:nums){
            if(num == nums1){
                cnt1++;
            }else if(num == nums2){
                cnt2++;
            }else if(cnt1 == 0){
                cnt1++;
                nums1 = num;
            }else if(cnt2 == 0){
                cnt2++;
                nums2 = num;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;cnt2=0;
        for(int num:nums){
            if(num == nums1)
            cnt1++;
            else if(num == nums2)
            cnt2++;
        }

        List<Integer>ans = new ArrayList<>();
        if(cnt1 > n/3)ans.add(nums1);
        if(cnt2 > n/3)ans.add(nums2);

        return ans;
    }
}