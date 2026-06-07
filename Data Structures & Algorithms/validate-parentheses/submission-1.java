class Solution {
    boolean check(char a,char b){
        if(a=='{' && b =='}') return true;
        if(a=='(' && b ==')') return true;
        if(a=='[' && b ==']') return true;

        return false;
    }
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);

            if(c == '(' || c =='{' || c =='[')
            st.push(c);
            else{
                if(st.empty())
                return false;
                char a = st.pop();
                if(check(a,c)==false)return false;
            }
        }
        return st.empty()?true:false;
    }
}
