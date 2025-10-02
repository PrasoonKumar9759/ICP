class Solution {
    public static void main(String[] args){
       char[][] grid ={ 
            {"1","1","1","1","0"},
            {"1","1","0","1","0"},
            {"1","1","0","0","0"},
            {"0","0","0","0","0"}
        }
        System.out.print(numIslands(grid))
    }
    public static int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public void dfs(char[][] grid,int row, int col){
        int m=grid.length, n=grid[0].length;
        if(row<0 || row>=m || col<0 || col>=n || grid[row][col]!='1'){
            return;
        }
        grid[row][col]='0';
        int[] r={0,0,1,-1};
        int[] c={-1,1,0,0};
        for(int i=0;i<r.length;i++){
            dfs(grid,row+r[i],col+c[i]);
        }
    }
}