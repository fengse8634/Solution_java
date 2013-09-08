import java.util.*;
public class Solution {
    public String minWindow(String S, String T) {
        int sLen = S.length();
        int tLen = T.length();
        HashMap<Character,Integer> needToFind = new HashMap<Character, Integer>();
        HashMap<Character,Integer> alreadyFind = new HashMap<Character, Integer>();
        for(int i=0;i<tLen;i++){
            char temp = T.charAt(i);
            if(needToFind.containsKey(temp)){
                int cur = needToFind.get(temp);
                needToFind.put(temp,cur+1);
            }
            else needToFind.put(temp,1);
        }
        int cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int minBegin=0, minEnd = 0;
        String ret = "";
        for(int left=0,right = 0;right<sLen;right++){
            char cur = S.charAt(right);
            if(needToFind.containsKey(cur)){
                if(alreadyFind.containsKey(cur)){
                    int curCnt = alreadyFind.get(cur);
                    alreadyFind.put(cur,curCnt+1);
                }
                else alreadyFind.put(cur,1);
                if(alreadyFind.get(cur)<=needToFind.get(cur)) cnt++;
                if(cnt==tLen){
                    char curChar = S.charAt(left);
                    while(!needToFind.containsKey(curChar) || needToFind.get(curChar)<alreadyFind.get(curChar)){
                        if(needToFind.containsKey(curChar))
                            alreadyFind.put(curChar, alreadyFind.get(curChar)-1);
                        left++;
                        curChar = S.charAt(left);
                    }
                    int curLen = right-left+1;
                    if(curLen < minLen){
                        minLen = curLen;
                        minBegin = left;
                        minEnd = right;
                    }
                }   
            }
        }
        if(cnt==tLen)
            return S.substring(minBegin,minEnd+1);
        else return ret;
    }
}