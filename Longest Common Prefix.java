import java.util.*;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len==0)  return new String("");
        String first = strs[0];
        
        for(int i=0;i<first.length();i++){
            char c = first.charAt(i);
            for(int j=1;j<len;j++){
                if(strs[j].length()<=i || strs[j].charAt(i)!=c)
                    return first.substring(0,i);
            }
            
        }
        return first;
    }
}
