class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//          int lo = 0;
//         if(matrix.length == 0) return false;
//         int n = matrix.length; 
//         int m = matrix[0].length; 
//         int hi = (n * m) - 1;
        
//         while(lo <= hi) {
//             int mid = (lo + (hi - lo) / 2);
//             if(matrix[mid/m][mid % m] == target) {
//                 return true;
//             }
//             if(matrix[mid/m][mid % m] < target) {
//                 lo = mid + 1;
//             }
//             else {
//                 hi = mid - 1;
//             }
//         }
//         return false;
        
          int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length-1 && target> matrix[i][j]){
            i++;
        }
        while(j>0 && matrix[i][j] > target){
            j--;
        }
        if(matrix[i][j] == target) return true;
        return false;
    }
}