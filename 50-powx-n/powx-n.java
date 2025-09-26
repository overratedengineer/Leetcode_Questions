class Solution {
    public double sol(double x, int n) {
        if (n==0) return 1;      
        if (n==1) return x;      
        
        if (n%2==0) {
            double ans = sol(x,n/2);
            return ans*ans;  
        } else {
            double ans=sol(x,n/2);
             return ans*ans*x;  
        }
    }

    public double myPow(double x, int n) {
        if (n<0) {
            return 1/sol(x, -n);   
        }
        return sol(x,n);
    }
}
