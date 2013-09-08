public class Solution {
    public int minPathSum(int[][] grid) {
        int cntR = grid.length;
        int cntC = 0;
        if(cntR!=0){
            cntC = grid[0].length;
        }
        else return 0;
        int[] buf = new int[cntC];
        for(int r=0;r<cntR;r++){
            buf[0] = buf[0]+grid[r][0];
            for(int c=1;c<cntC;c++){
                if(r==0) buf[c] = buf[c-1]+grid[r][c];
                else buf[c]=Math.min(buf[c],buf[c-1])+grid[r][c];
            }
        }
        return buf[cntC-1];        
    }
}