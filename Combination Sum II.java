import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        //boolean buf = new boolean[num.length];
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(num);
        helper(res,num,target,0,temp);
        return res;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> res,int[] num,int left,int index,ArrayList<Integer> temp){
        if(left==0){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        
        
        for(int i=index;i<num.length;i++){
            if(left-num[i] < 0) break;
            if(i!=index && num[i]==num[i-1])    continue;
            temp.add(num[i]);
            helper(res,num,left-num[i],i+1,temp);
            temp.remove(temp.size()-1);
        } 
    }
}