public class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        
        int [][] buf = new int[len1+1][len2+1];
        
        for(int i=0;i<=len1;i++){
            buf[i][0] = i;
        }
        for(int i=0;i<=len2;i++){
            buf[0][i] = i;
        }
        
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    buf[i][j]=buf[i-1][j-1];
                }
                else{
                    int temp = Math.min(buf[i-1][j],buf[i][j-1]);
                    buf[i][j]=Math.min(buf[i-1][j-1],temp)+1;
                }
            }
        }
        return buf[len1][len2];
    }
}