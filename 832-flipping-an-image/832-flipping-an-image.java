class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i <image.length; i++) {
  
        // Initialise start and end index
        int start = 0;
        int end = image.length - 1;
  
        // Till start < end, swap the element
        // at start and end index
        while (start < end) {
  
            // Swap the element
            int temp = image[i][start];
            image[i][start] = image[i][end];
            image[i][end] = temp;
  
            // Increment start and decrement
            // end for next pair of swapping
            start++;
            end--;
        }
    }
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image.length; j++){
                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
}
}