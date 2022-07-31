class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        else if(n==1) return x;
        else if(n<0) return 1/x * myPow(1/x, -(n+1));
        else{
            double y= myPow(x,n/2);
            if(n%2==0)
                return y*y;
            else return x*y*y;
        }
    }
}