class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & -n) == n;
    }
}






//  class Solution {
//      public boolean isPowerOfTwo(int n) {
//          if(n>1) while(n%2==0) n /= 2;
//        return n==1; 
      
//    }
//  }