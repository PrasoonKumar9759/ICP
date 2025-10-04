class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE,s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            sum=Math.max(s,sum);
            if(s<0){
                s=0;
            }
        }
        return sum;
    }
}