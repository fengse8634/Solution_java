public class Solution {
    public String strStr(String haystack, String needle) {
        int hayL = haystack.length();
        int needL = needle.length();
        if( needL > hayL)    return null;
        
        int i=0;
        int k=0;
        //here notice the end of the range of the index
        for(;i<=hayL-needL;i++){
            k=0;
            for(;k<needL;k++){
                if(haystack.charAt(i+k)!=needle.charAt(k))
                    break;
            }
            if(k==needL)    return haystack.substring(i);
        }
        return null;   
    }
}