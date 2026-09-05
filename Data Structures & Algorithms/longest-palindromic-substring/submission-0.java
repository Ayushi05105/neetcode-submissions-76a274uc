class Solution {
    int start =0;
    int end =0;
    int maxLen =0;
    public void expand(String s,int i,int j){
        while(i>=0 && j< s.length() && s.charAt(i)==s.charAt(j)){
            if(j-i+1> maxLen){
                maxLen = j-i+1;
                start =i;
                end =j;
            }
            
            i--;
            j++;
        }
    }
    public String longestPalindrome(String s) {
        for(int i =0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(start,end+1);
    }
}
