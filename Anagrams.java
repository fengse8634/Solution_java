import java.util.*;

public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        ArrayList<String> res = new ArrayList<String>();
        Hashtable <String,ArrayList<String>> map = new Hashtable<String,ArrayList<String>>();
        for(String str :strs){
            char [] temp = str.toCharArray();
            Arrays.sort(temp);
            String sortedStr = new String(temp);
            if(map.containsKey(sortedStr)){
                ArrayList<String> head = map.get(sortedStr);
                head.add(str);
            }
            else{
                ArrayList<String> newArray = new ArrayList<String>();
                newArray.add(str);
                map.put(sortedStr, newArray);
            }
        }
        
        for(String key : map.keySet()){
            ArrayList<String> value = map.get(key);
            int size =  value.size();
            if(size > 1){
                for(String str :map.get(key)){
                    res.add(str);
                }
            }  
        }
        return res;
    }
}