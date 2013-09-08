public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        int [] buf = new int[n];
        for(int i=0;i<n;i++){
            buf[i]=-1;
        }

        ArrayList<String[]> res = new ArrayList<String[]>();
        String[] strArray = new String[n];
        recurse(n,buf,res,0,strArray);
        return res; 
    }
    
    public void recurse(int n, int[] buf,ArrayList<String[]> res, int curRow,String[] strArray){
        if(curRow==n){
            String[] f = Arrays.copyOf(strArray, n);
            res.add(f);
            return;
        }

        
        for(int i=0;i<n;i++){
            StringBuffer temp = new StringBuffer();
            for(int o=0;o<n;o++){
                temp.append(".");
            }
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
                    temp.setCharAt(i,'Q');
                    strArray[curRow] = temp.toString();
                    recurse(n,buf,res,curRow+1,strArray);
                    buf[i]=-1;
                }
            }
        }
    }
}