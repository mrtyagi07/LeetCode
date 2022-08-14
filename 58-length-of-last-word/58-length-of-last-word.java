class Solution {
 public int lengthOfLastWord(String s) {
int n = s.length();
int len=0;
for(int i=n-1;i>=0;i--){
int temp=s.charAt(i);
if(temp>=65 && temp<=90 || temp>=97 && temp<=122){
len++;
}
else{
if(len>0)
return len;
continue;
}
}
return len;
 }
}





// class Solution {
//     public int lengthOfLastWord(String s) {
//        int count=0;
//         char[] sArray = s.toCharArray();
//          int len=sArray.length-1;
//         while(sArray[len]==' ')
//             len--;
        
//         while(len>-1  &&  sArray[len]!=' '){
//             count++;
//             len--;
//         }
//         return count;
//     }
// }