public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        helper(res,n,k,temp,0);
        return res;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> res, int n, int k,ArrayList<Integer> temp, int index){
        if(temp.size()==k){
            res.add(new  ArrayList<Integer>(temp));
            return;
        }
        
        for(int i=index;i<n;i++){
                temp.add(i+1);
                helper(res,n,k,temp,i+1);
                temp.remove(temp.size()-1);
        }
    }
}