public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String res=s.substring(0,1);
        if(len==1)  return s;
        if(len==2){
            if(s.charAt(0)==s.charAt(1))
                return s;
            else return res;
        }
        
        for(int i=0;i<len-1;i++){
            String longest1 = findLongestSub1(s,i);
            String longest2 = findLongestSub1(s,i);
            int len1 = longest1.length();
            int len2 = 0;
            if(s.charAt(i)==s.charAt(i+1)){
                longest2 = findLongestSub2(s,i);
                len2 = longest2.length();
            }
            
            res = res.length() > len1 ? res : longest1;
            res = res.length() > len2 ? res : longest2;
        }
        return res;
    }
    
    public String findLongestSub1(String s, int start){
        int cnt = 0;
        for(int i=start-1,j=start+1;i>=0 && j<s.length();i--,j++){
            if(s.charAt(i)==s.charAt(j))    
                cnt++;
            else break;
        }
        return s.substring(start-cnt,start + cnt+1);

    }
    
    public String findLongestSub2(String s, int start){
        int cnt2= 0;
        for(int i=start-1,j=start+2;i>=0 && j<s.length();i--,j++){
            if(s.charAt(i)==s.charAt(j))    
                cnt2++;
            else break;
        }            
        return s.substring(start-cnt2,start + cnt2+2);
    }
}