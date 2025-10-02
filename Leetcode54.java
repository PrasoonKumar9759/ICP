class Solution {
    public static void main(String[] args){
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}}
    }
    public static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list=new ArrayList<>();
       int m=arr.length, n=arr[0].length;
       int minr=0,maxr=arr.length-1;
       int minc=0,maxc=arr[0].length-1;
       int total=m*n,c=0;
       while(c<total && minr<=maxr && minc<=maxc){
        for(int i=minc;i<=maxc && c<total;i++){
            list.add(arr[minr][i]);
            c++;
        }
        minr++;
        for(int i=minr;i<=maxr && c<total;i++){
            list.add(arr[i][maxc]);
            c++;
        }
        maxc--;
        for(int i=maxc;i>=minc && c<total;i--){
            list.add(arr[maxr][i]);
            c++;
        }
        maxr--;
        for(int i=maxr;i>=minr && c<total;i--){
            list.add(arr[i][minc]);
            c++;
        }
        minc++;
       }
       return list;
    }

}