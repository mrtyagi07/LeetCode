class Solution {
    private final int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int shortestPath(int[][] grid, int k) {
        // idea - BFS over grid while tracking min obstacles for each position
        int m = grid.length, n = grid[0].length;
        // min obstacles
        int[][] min = new int[m][n];
        // initial with max value
        for (int[] row : min) {
            Arrays.fill(row, k + 1);
        }
        
        int step = 0;
        // set up BFS
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{0, 0, 0});
        min[0][0] = 0;
        while (!que.isEmpty()) {
            for (int i = que.size(); i > 0; i--) {
                int[] cur = que.poll();
                // check if reach end
                if (cur[0] == m - 1 && cur[1] == n - 1) {
                    return step;
                }
                // traverse in 4 directions
                for (int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    // check if out of border
                    if (x < 0 || x >= m || y < 0 || y >= n) {
                        continue;
                    }
                    // current obstacles
                    int count = cur[2] + grid[x][y];
                    // if this path met >= min obstacles OR more than k
                    // skip it
                    if (count >= min[x][y] || count > k) {
                        continue;
                    }
                    // update obstacle count
                    min[x][y] = count;
                    // add this into next level BFS
                    que.offer(new int[]{x, y, count});
                }
            }
            step++;
        }
        
        return -1;
    }
}