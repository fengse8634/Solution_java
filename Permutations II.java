import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int cnt = num.length;
        int [] buf = new int[cnt];
        Arrays.sort(num);
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
                if(i==0 || num[i]!=num[i-1] ||(num[i]==num[i-1] && buf[i-1]!=0)){
                    temp.add(num[i]);
                    buf[i]=1;
                    helper(res,num,temp,cnt,buf);
                    buf[i]=0;
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}