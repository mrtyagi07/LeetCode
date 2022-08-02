class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0],high = matrix[n-1][n-1];
        
        while(low < high){
            int mid = low + (high - low)/2;
            if(count(mid,matrix,k) == true){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        
        return low;
    }
    
    public boolean count(int target,int [][]matrix,int k){
        int c = 0;
        for(int[] row : matrix){
            for(int i : row){
                if(i <= target)c+=1;
                else break;
            }
        }
        return c >= k;
    }
}