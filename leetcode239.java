
import java.util.ArrayDeque;

import java.util.Deque;


public class leetcode239 {
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] max=new int[nums.length-k+1];
        int l=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }

            while(dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>k-1){
                max[l]=dq.peekFirst();
                l++;
            }
        }
        return max;
    }
}