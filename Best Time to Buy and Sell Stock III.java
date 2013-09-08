public class Solution {
    public int maxProfit(int[] prices) {
        int [] f = new int[]{0,0,0};
        int [] g = new int[]{0,0,0};
        
        for(int i=0;i<prices.length-1;i++){
            int diff = prices[i+1]-prices[i];
            int m = Math.min(i+1,2);
            
            for(int j=m;j>=1;j--){
                f[j] =  Math.max(f[j],g[j-1])+diff;
                g[j] = Math.max(f[j],g[j]);
            }
        }
        return Math.max(g[1],g[2]);
    }
}
