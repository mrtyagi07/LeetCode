class Solution {
    // Function to check if the position is a valid point in the Island
    private boolean isValid(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == '0') {
                return true;
        }    
        
        return false;
    }
    private void dfs(char[][] grid, int x, int y) {
        // Check if the co-ordinate is valid
        if (isValid(grid,x,y)) {
                return;
        }
        
        // Mark the grid as 0 so that it is not considered in the next iterations
        grid[x][y] = '0';
        
        // Move to all posible locations
        dfs(grid, x + 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x - 1, y);
        dfs(grid, x, y - 1);
    }
    
    public int numIslands(char[][] grid) {
        int island = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    island++;
                    dfs(grid, i, j);
                }
            }
        }

        return island;    
    }
}