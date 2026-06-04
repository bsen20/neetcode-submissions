class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];

        int i = 0;
        String res = "";
        while(i < Math.min(a.length(),b.length())){
            if(a.charAt(i)!=b.charAt(i)){
                break;
            }
            res = res+=a.charAt(i);
            i++;
        }
        return res;
    }
}