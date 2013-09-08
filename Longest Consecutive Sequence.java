import java.util.*;

public class Solution {
    public int longestConsecutive(int[] num) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i:num){
            set.add(i);
        }
        int res = 1;
        int cnt = 1;
        Integer [] arr = set.toArray(new Integer[0]);

        for(int i=0;i<arr.length-1;i++){ 
            if(arr[i+1]-arr[i]==1)    cnt++;
            else cnt = 1;
            res = res > cnt ? res : cnt;
        }
        return res; 
    }
}