public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int cnt = num.length;
        int [] buf = new int[cnt];
        ArrayList<Integer> temp = new ArrayList<Integer>();
        helper(res,num,temp,cnt,buf);
        return res;
        
    }
    
    public void helper(ArrayList<ArrayList<Integer>> res, int [] num, ArrayList<Integer> temp,int cnt,int [] buf){
        if(temp.size()==cnt){
            res.add((ArrayList<Integer>)temp.clone());
            return ;
        }
        for(int i=0;i<cnt;i++){
            if(buf[i]==0){
                temp.add(num[i]);
                buf[i]=1;
                helper(res,num,temp,cnt,buf);
                buf[i]=0;
                temp.remove(temp.size()-1);
            }
        }
    }
}