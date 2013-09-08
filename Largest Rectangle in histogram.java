public class Solution {
    public int largestRectangleArea(int[] height) {
        int res = 0;
        int preHeight=0;
        for(int i=0;i<height.length;i++){
            if(i!=0 && height[i]<=height[i-1]) continue;
            int curHeight = height[i];
            int cntBar = 1;
            res = res > (curHeight * cntBar) ? res : curHeight * cntBar;
            for(int j=i+1;j<height.length;j++){
                if(height[j]==0)    break;
                if(height[j]<curHeight) curHeight = height[j];
                cntBar++;
                res = res > (curHeight * cntBar) ? res : curHeight * cntBar;
            }
            //res = res > (curHeight * cntBar) ? res : curHeight * cntBar;
        }
        return res;
    }
}