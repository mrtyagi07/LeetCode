class Solution {
    public boolean isPowerOfFour(int n) {
        double pow = Math.log(n)/Math.log(4);
        return pow==(int)pow;
    }
}

// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if(n>1) while(n%4==0) n /= 4;
//       return n==1; 
      
//     }
// }