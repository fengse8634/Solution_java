public class Solution {
    public int divide(int dividend, int divisor) {
        long end = Math.abs((long)dividend);
        long sor = Math.abs((long)divisor);
        int ret = 0;
        while(end >=sor){
            long c = sor;
            
            for(int i=0;end>=c;i++,c=c<<1){
                end = end-c;
                ret = ret+(1<<i);
              //  if(c >= Integer.MAX_VALUE/2) break;
            }
            
        }
        return (dividend^divisor)>>31 ==0 ? ret : ret*(-1);
    }
}