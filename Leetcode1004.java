class Solution {
    public static void main(String[] args){
        int[] binary={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.print(longestOnes(binary,k));
    }
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int s=0,e=0;
        int c=0;
        while(e<nums.length){
            if(nums[e]==0) c++;
            while(s<=e && c>k){
                if(nums[s]==0) c--;
                s++;
            }
            ans=Math.max(ans, e-s+1);
            e++;
        }
        return ans;
    }
}