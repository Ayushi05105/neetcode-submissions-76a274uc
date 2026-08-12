class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second = second;
    }
}
class Solution {
    public void bfs(char[][] grid,int[][] vis,int row,int col){
        int n = grid.length;
        int m = grid[0].length;
        vis[row][col] =1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));

        int[] dr ={-1,0,1,0};
        int[] dc ={0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int r = curr.first;
            int c = curr.second;
            for(int i =0;i<4;i++){
                int nr = r+dr[i];
                int nc = c + dc[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]=='1' && vis[nr][nc]==0){
                    vis[nr][nc]=1;
                    q.add(new Pair(nr,nc));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt =0;
        int[][] vis = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    cnt++;
                    bfs(grid,vis,i,j);
                }
            }
        }
        return cnt;
    }
}
