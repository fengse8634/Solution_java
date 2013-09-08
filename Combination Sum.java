import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(candidates);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        helper(candidates, target, res,candidates.length-1,temp);
        return res;    
    }
    
    
    void helper(int [] candidates, int left, ArrayList<ArrayList<Integer>> res, int index,ArrayList<Integer> temp){
        if(left==0){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        if(index<0){
            return;
        }
        int curMax = candidates[index];
        
        
        for(int i=left/curMax;i>=0;i--){
            if(i!=0){
                int cnt =i;
                while(cnt!=0){
                    cnt--;
                    temp.add(0,curMax);
                }
            }
            helper(candidates, left-i*curMax, res,index-1,temp);
            if(i!=0){
                int cnt =i;
                while(cnt!=0){
                    cnt--;
                    temp.remove(0);
                }
            }
        }
        
    }
}


public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> re = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> li = new ArrayList<Integer>();
        getlist(candidates,target,li,re,0);
        
        return re;
        
    } 
    
    public void getlist(int[] candidates, int target, ArrayList<Integer> li,ArrayList<ArrayList<Integer>> reli,int start){
        if(target == 0){
            ArrayList<Integer> t = new ArrayList<Integer>(li);
            if(!reli.contains(t))
                reli.add(t);
            return;
        }
        
        for(int i=start; i<candidates.length; i++){
            if(target-candidates[i]>=0){
            	li.add(candidates[i]);
                getlist(candidates,target-candidates[i],li,reli,i);
                li.remove(li.size()-1);
       
            }
        }
    }
}