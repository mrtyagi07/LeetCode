class Solution {
    
    public int kthSmallest(int[][] matrix, int k) {
        // Making a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(10,                  Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                // Adding the elements to the queue
                pq.add(matrix[i][j]);
                // When the size is reached stop
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        // Returning the first element
        return pq.peek();
    }
}