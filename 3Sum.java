import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length < 3)  return res;
        
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            if(i!=0 && num[i]==num[i-1]) continue;
            for(int j=i+1,k=num.length-1;j<k;){
                if(j!=i+1 && num[j]==num[j-1]){
                    j++;
                    continue;
                }
                if(k!=num.length-1 && num[k]==num[k+1]){
                    k--;
                    continue;
                }
                int sum = num[i]+num[j]+num[k];
                if(sum==0){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(num[i]);
                    temp.add(num[j]);
                    temp.add(num[k]);
                    res.add(temp);
                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else k--;
            }
        }
        return res;
    }
}