class Solution {
   public String countAndSay(int n) {
        return count("1",n);
    }
    public String count(String s,int n){
        
        if(n==1){//the condition of end, get the sequence of the n times "count and say"
            return s;
        }
        int count=0;
        String str="";
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
                count++;
            }else if(i+1<s.length()&&s.charAt(i)!=s.charAt(i+1)){
                count++;
                str+=count+""+s.charAt(i);
                count=0;
            }else{//initalize the seed of string "1",it is just used once
                count++;
                str+=count+""+s.charAt(i);
            }    
            
        }
        
        return count(str,n-1);
    }
}