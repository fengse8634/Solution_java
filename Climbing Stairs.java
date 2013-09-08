public class Solution {
    public int climbStairs(int n) {
        int [] buf = new int[n+1];
        buf[1]=1;
        if (n>1) buf[2]=2;
        return helper(n,buf);
    }
    
    int helper(int n , int [] buf){
        if(buf[n]==0)   
            buf[n] = helper(n-1,buf) + helper(n-2,buf);
        return buf[n];
    }
}