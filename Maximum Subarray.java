public class Solution {
    public int maxSubArray(int[] A) {
        int res=Integer.MIN_VALUE;
        int temp = 0;
        for(int i=0;i<A.length;i++){
            temp += A[i];
            res =  temp > res ? temp : res;
            if(temp < 0)
                temp = 0;
        }
        return res;
        
    }
}