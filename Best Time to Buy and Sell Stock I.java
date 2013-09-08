public class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int minIndex = 0;
        //Only remember the min Index, so every time,
        //compare the current one with the minIndex one.
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<prices[minIndex])
                minIndex =i;
            int diff = prices[i]-prices[minIndex];
            res = diff > res ? diff: res;
        }
        return res;
    }
}