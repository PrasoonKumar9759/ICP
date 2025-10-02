class Solution {
    public static void main(String[] args){
        String s="abcabcbb";
        System.out.print(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        int l=0,r=0,maxlen=0,n=s.length(),l=0;
        for(int i=0;i<256;i++){
            hash[i]=-1;
        }
        while(r<n){
            if(hash[s.charAt[r]]!=-1){
                if(hash[s.charAt(r)>=l]){
                    l=hash[s.charAt(r)]+1;
                }
            }
            len=r-l+1;
            maxlen=Math.max(len,maxlen);
            hash[s.charAt[r]]=r;
            r++;
        }
    }
}