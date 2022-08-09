class Solution {
       public int numFactoredBinaryTrees(int[] A) {
         int M = 1000000007;
         Arrays.sort(A);
         long[] record = new long[A.length];
         record[0] = 1;
         Map<Integer, Integer> map = new HashMap<>();
         map.put(A[0], 0);
         for (int i = 1; i < A.length; i++) {
         long sum = 1;
         for (int j = 0; j < i; j++) {
           if (A[i] % A[j] != 0) {
             continue;
         }
    if (map.containsKey(A[i] / A[j])) {
          sum += record[j] * record[map.get(A[i] / A[j])];
       }
 }
     record[i] = sum;
     map.put(A[i], i);
}
     int result = 0;
     for (long i : record) {
     result += i % M;
     result %= M;
  }
           return result;
   }
}