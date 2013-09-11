import java.util.*;
public class Solution {
    public void nextPermutation(int[] num) {
        int len = num.length;
        int i=len-2;
        for(;i>=0;i--){
            if(num[i] < num[i+1])   break;
        }
        int j=len-1;
        for(;j>=i+1&&i>=0;j--){
            if(num[j]>num[i]){
                int temp = num[i];
                num[i]=num[j];
                num[j]=temp;
                reverseArray(num,i+1,len-1);
                return;
            }
        }
        reverseArray(num,0,len-1);
    }
    void reverseArray(int [] num, int start, int end){
        for(int i=start,j=end;i<j;i++,j--){
            int temp = num[i];
            num[i]=num[j];
            num[j]=temp;
        }
    }
    
}