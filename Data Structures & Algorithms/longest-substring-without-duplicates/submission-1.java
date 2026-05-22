class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        Arrays.fill(freq,-1);
        int l =0;
        int r =0;
        int n = s.length();
        int MaxLen =0;
        while(r<n){
            if(freq[s.charAt(r)]!=-1){
                if(freq[s.charAt(r)]>=l){
                    l = freq[s.charAt(r)]+1;
                }
               
            }
            int len = r-l+1;
            MaxLen = Math.max(MaxLen,len);
            freq[s.charAt(r)]=r;
            r++;
        }
        return MaxLen;
    }
}
