class Solution {
    public static void main(String[] args){
        int[] ar={3,2,2,1};
        int limit=3
        System.out.print(numRescueBoats(ar,limit));
    }
    public int numRescueBoats(int[] arr, int limit){ 
        int boat=0;
        int s=0,e=arr.length-1;
        Arrays.sort(arr);
        while(s<=e){
            if(arr[s]+arr[e]<=limit){
                s++;
                e--;
            }else{
                e--;
            }
            boat++;
        }
        return boat;
    }
}