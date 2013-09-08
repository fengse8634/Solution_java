public class Solution {
    public int totalNQueens(int n) {
        int [] buf = new int[n];
        for(int i=0;i<n;i++){
            buf[i]=-1;
        }
        return recurse(n,buf,0);       
    }
    
    public int recurse(int n, int[] buf,int curRow){
        int res = 0;
        if(curRow==n){
            return 1;
        }      
        for(int i=0;i<n;i++){
            if(buf[i]==-1){
                boolean ifValid = true;
                for(int j=0;j<n;j++){
                    if(buf[j]!=-1)
                        if(Math.abs(i-j)==Math.abs(buf[j]-curRow)){
                            ifValid = false;
                            break;
                    }                    
                }
                if(ifValid){
                    buf[i]= curRow;
                    res += recurse(n,buf,curRow+1);
                    buf[i]=-1;
                }
            }
        }
        return res;
    }
}