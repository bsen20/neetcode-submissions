class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer>map = new HashMap<>();
        //Custome MaxHeap
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->{
            if(a[0] != b[0]){
                return Integer.compare(b[0],a[0]);
            }else 
                return Integer.compare(a[1],b[1]);
        });
        int[] ans = new int[k];
        int n = nums.length;

        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        map.forEach((key,value)->{
            maxHeap.add(new int[]{
                value,
                key
            });
        });
        
        while(k > 0){
            int top[] = maxHeap.poll();
            ans[k-1] = top[1];
            k = k -1;
        }
        return ans;

    }
}
