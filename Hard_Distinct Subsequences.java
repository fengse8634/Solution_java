public class Solution {
    public int numDistinct(String S, String T) {
        int [] buf = new int[T.length()+1];
        buf[T.length()]=1;
        for(int i = S.length()-1 ; i >=0; i--){
            
            for(int j=0; j<T.length(); j++){
                
                if(S.charAt(i)==T.charAt(j))
                    buf[j] = buf[j]+buf[j+1];
            }
        }
        return buf[0];
    }
}