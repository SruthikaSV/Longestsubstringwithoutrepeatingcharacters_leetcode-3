class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int countofdp=0;
        int ans=0;
        int n = s.length();
        int freq[] = new int[128];
        while(end<n) {
            char ch = s.charAt(end);
            if(freq[ch]==1) {
                countofdp++;
            }
            freq[ch]++;
            end++;
            while(countofdp>0) {
                char ch1 = s.charAt(start);
                if(freq[ch1]==2) 
                    countofdp--;
                
                freq[ch1]--;
                start++;
            }
            ans = Math.max(ans,end-start);
        }
        return ans;
    }

}