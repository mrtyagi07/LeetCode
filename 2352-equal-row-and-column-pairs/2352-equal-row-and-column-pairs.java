class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int[][] rotated = new int[grid.length][grid.length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                rotated[j][i] = grid[i][j];
            }
        }
        for(int i = 0; i < rotated.length; i++){
            for(int j = 0; j < rotated.length; j++){
                if(Arrays.equals(rotated[i], grid[j])) count++;
            }
        }
        return count;
    }
}
