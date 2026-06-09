class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer>st = new Stack<>();

        for(String s:ops){
            if(s.equals("+")){
                
                int b = st.pop();
                int a = st.pop();
                int c = a+ b;
                st.push(a);
                st.push(b);
                st.push(c);
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int b = st.pop();
                int c = 2* b;
                st.push(b);
                st.push(c);
            }else
            st.push(Integer.parseInt(s));
        }
        int sum = 0;
        while(!st.empty()){
            sum+=st.pop();
        }
        return sum;

    }
}