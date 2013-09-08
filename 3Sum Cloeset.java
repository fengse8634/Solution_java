import java.util.*;

public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int closest = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(num);
        
        for(int i=0;i<num.length-2;i++){
            for(int j=i+1,k=num.length-1;j<k;){
                int sum = num[i]+num[j]+num[k];
                int newC = Math.abs(sum-target);
                if(closest > newC){
                    res = sum;
                    closest = newC;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
            
        }
        return res;
    }
}