class Solution{
public boolean isPowerOfFour(int n) {
int fac =0b01010101010101010101010101010101;
return n>0 && (n&(n-1))==0 && (fac&n)>0;
 }
}


// class Solution {
//     public boolean isPowerOfFour(int n) {
//         double pow = Math.log(n)/Math.log(4);
//         return pow==(int)pow;
//     }
// }


// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if(n>1) while(n%4==0) n /= 4;
//       return n==1; 
      
//     }
// }