class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean [][] pacific = new boolean[m][n];
        boolean [][] atlantic = new boolean[m][n];
        
        for(int i = 0; i < m; i++){
            dfs(i, 0, pacific, heights, -1);
            dfs(i, n - 1, atlantic, heights, -1);
        }
        
        for(int j = 0; j < n; j++){
            dfs(0, j, pacific, heights, -1);
            
            dfs(m - 1, j, atlantic, heights, -1);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> al = new ArrayList<>();
                    al.add(i);
                    al.add(j);
                    ans.add(al);
                }
            }
        }
        return ans;
    }
    
    int [][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}}; // tldr
    
    private void dfs(int i, int j, boolean [][] reach, int [][] matrix, int prevHt){
        reach[i][j] = true;
        prevHt = matrix[i][j];
        for(int [] dir : dirs){
            int ni = i + dir[0];
            int nj = j + dir[1];
            
            if(ni >= 0 && ni < matrix.length && nj >= 0 && nj < matrix[i].length && matrix[ni][nj] >= prevHt && reach[ni][nj] == false){
                dfs(ni, nj, reach, matrix, matrix[ni][nj]);
            }
        }
    }
}
