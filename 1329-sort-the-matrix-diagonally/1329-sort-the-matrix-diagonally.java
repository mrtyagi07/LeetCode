class Solution {
	public int[][] diagonalSort(int[][] mat) {
		//sort row-wise diagonally [00, 10, 20]
		for(int i=0; i<mat.length; i++) countAndSort(mat, i, 0);

		//sort column-wise diagonally [01, 02, 03]
		for(int i=0; i<mat[0].length; i++) countAndSort(mat, 0, i);

		return mat;
	}

	public void countAndSort(int[][] mat, int i, int j) {
		int[] arr = new int[101];
		int r = i;
		int c = j;

		//store the count in arr
		while(r < mat.length && c < mat[0].length)
			arr[mat[r++][c++]]++;

		r = i;
		c = j;

		//loop through [1-100] constraint range and update mat diagonally
		for(int k=1; k<101; k++) {
			while(arr[k]-- > 0) {
				mat[r++][c++] = k;
			}
		}
	}
}