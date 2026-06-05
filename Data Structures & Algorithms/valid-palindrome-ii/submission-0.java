class Solution {
    private boolean helper(String s,int i,int j){
        while(i<=j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a != b)
            return false;
            i++;j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0 , j = s.length()-1;

        while(i<=j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a != b){
                //call the skip eithe i or j 
                return helper(s,i+1,j) || helper(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
}