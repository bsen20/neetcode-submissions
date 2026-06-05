class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        String res = "";
        for(i = 0;i<Math.min(word1.length(),word2.length());i++){
            res = res + word1.charAt(i) + word2.charAt(i);
        }
        if(i<word1.length()){
            res = res + word1.substring(i);
        }
        if(i<word2.length()){
            res = res + word2.substring(i);
        }
        return res;
    }
}