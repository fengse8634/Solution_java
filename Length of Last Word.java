public class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int len = s.length();
        boolean ifEmpty = true;
        int preRes = 0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)!=' '){
                if(ifEmpty) ifEmpty = false;
                res++;
            }
            else{
                preRes = res==0? preRes : res;
                res = 0;
            }
        }
        if(res==0 && ifEmpty==false)    res = preRes;
        return res;
    }
}