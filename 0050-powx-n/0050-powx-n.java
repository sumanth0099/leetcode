class Solution {
        int value=0;
    public static double  FindPow(double a,long b){
        if(b==1)
        return a;
        else if(b%2==0)
        return FindPow(a*a, b/2);
        else
        return a*FindPow(a, b-1);
    }
    public double myPow(double x, long n) {
        if(n==0)
        return 1;
        if(n>0)
        return FindPow(x,n);
        else 
        return 1/FindPow(x,-1*n);
    }
}