class Solution {
public:
    void rotate(vector<vector<int>>& matrix) 
    {
        int n = matrix.size();
        for (int k=0; k<n/2; k++)
        {
            for (int i=k; i<n-1-k; i++)
            {
                int x = matrix[k][i];
                swap(matrix[i][n-1-k],x);
                swap(matrix[n-1-k][n-1-i],x);
                swap(matrix[n-1-i][k],x);
                swap(matrix[k][i],x);
            }
        }
    }
};