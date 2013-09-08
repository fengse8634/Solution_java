public class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        
        for(int i=0,j=height.length-1;i<j;){
            int left = height[i];
            int right = height[j];
            if(left<right){
                res = Math.max(res,left*(j-i));
                i++;
                while(i<j && height[i]<height[i-1])
                    i++;
            }
            else{
                res = Math.max(right*(j-i),res);
                j--;
                while(i<j && height[j]<height[j+1])
                    j--;
            }
            res = Math.max(res,Math.min(height[i],height[j])*(j-i));
        }
        return res;
    }
}