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
        //cutom minheap
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->{
            if(a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }else 
                return Integer.compare(a[1],b[1]);
        });
        int[] ans = new int[k];
        int n = nums.length;

        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(new int[]{
                entry.getValue(),
                entry.getKey()
            });
            if(minHeap.size() > k)
                minHeap.poll();
        }
        
        int i = k - 1;
        while(!minHeap.isEmpty()){
            int top[] = minHeap.poll();
            ans[i] = top[1];
            i--;
        }
        return ans;

    }
}