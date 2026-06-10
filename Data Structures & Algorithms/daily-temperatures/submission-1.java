class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>st = new Stack<>();
        int n = temp.length;
        int[] ans = new int[n];
        for(int i = n-1; i>=0;i--){
            int todayTemp = temp[i];
            int nextDay = 0;
            while(!st.empty() && temp[st.peek()] <= todayTemp){
                st.pop();
            }
            if(!st.empty()){
                ans[i] = st.peek() - i;
            }else{
                ans[i] = 0;
            }
            st.push(i);   
        }
        return ans;
    }
}
