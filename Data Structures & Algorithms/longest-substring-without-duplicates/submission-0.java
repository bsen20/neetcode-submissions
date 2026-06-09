class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>st = new HashSet<>();
        int i = 0, j = 0;
        int max = 0;
        while(j < s.length()){
            char c = s.charAt(j);
            while(st.contains(c)){
                char x = s.charAt(i);
                st.remove(x);
                i++;
            }
            st.add(c);
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
