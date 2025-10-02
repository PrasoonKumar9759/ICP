class Solution {
    public static void main(String[] args){
        int[][] intervals={{1,2},{1,3},{2,3},{3,4}};
        System.out.print(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });
        int n=intervals.length;
        int prev=0;
        int start=1;
        int ans=0;
        while(start<n){
            if(intervals[start][0]<intervals[prev][1]){
                ans++;
                if(intervals[start][1]>intervals[prev][1]){
                    start++;
                }else{
                    prev=start;
                    start++;
                }
                
            }else{
                prev=start;
                start++;
            }

        }
        return ans;



    }
}