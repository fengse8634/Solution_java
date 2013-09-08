public class Solution {
    public boolean canJump(int[] A) {
        int maxIndex = 0;
        for(int i=0;i<A.length && i<=maxIndex;i++){
            int currLen = A[i]+i;
            maxIndex = maxIndex >= currLen ? maxIndex : currLen;
            if(maxIndex>=A.length-1)    return true;
        }
        return false;
    }
}