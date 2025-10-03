class Solution {
    public static void main(){
       char[][] board = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
       String word = "ABCCED";
       System.out.print(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] arr,String w,int i,int j,int s){
        if(s==w.length()) return true;
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]!=w.charAt(s)){
            return false;
        }
        int[] r={0,0,1,-1};
        int[] c={1,-1,0,0};
        arr[i][j]='*';
        for(int l=0;l<r.length;l++){
            boolean ans=search(arr,w,i+r[l],j+c[l],s+1);
            if(ans){
                return true;
            }
        }
        arr[i][j]=w.charAt(s);
        return false;

    }
}