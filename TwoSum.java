
import java.util.*;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Hashtable<Integer, Integer> buf = new Hashtable<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            int left = target - numbers[i];
            if(buf.containsKey(left)){
                if(i+1 < buf.get(left))
                    return new int[]{i+1, buf.get(left)};
                else
                    return new int[]{buf.get(left),i+1};
            }
            if(!buf.containsKey(numbers[i])){
                buf.put(numbers[i],i+1);
            }
        }
        return new int[]{0,0};
    }
}