class Solution {
    public static void main(String[] args){
        String s1="ab";
        String s2="eidbaoo";
        System.out.print(checkInclusion(s1,s2));
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int[] freq=new int[26];
        for(char a:s1.toCharArray()){
            freq[a-'a']++;
        }
        int[] frq=new int[26];
        for(int i=0;i<s2.length();i++){
            frq[s2.charAt(i)-'a']++;
            if(i+1-s1.length()>=0){
                if(check(freq,frq))return true;
                else{
                    int rm=i+1-s1.length();
                    frq[s2.charAt(rm)-'a']--;
                }
            }
        }
        return false;
    }
    public boolean check(int[] freq,int[] f1){
        for(int i=0;i<26;i++){
            if(freq[i]!=f1[i]) return false;
        }
        return true;
    }
}