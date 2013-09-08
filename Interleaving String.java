public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
		int l1 = s1.length();
		int l2 = s2.length();
		int l3 = s3.length();		
		if(l1+l2!=l3) return false;
		int[][] dptable = new int[l2+1][l1+1];
		dptable[0][0] = 1;
		
		for(int i=1; i<=l1; i++){
			if(dptable[0][i-1]==1 && s3.charAt(i-1) == s1.charAt(i-1))
				dptable[0][i] = 1;
			else
				dptable[0][i] = 0;
		}
		
		for(int i=1; i<=l2; i++){
			if(dptable[i-1][0] == 1 && s3.charAt(i-1)==s2.charAt(i-1))
				dptable[i][0] = 1;
			else
				dptable[i][0] = 0;
		}
        for(int i=1; i<=l2; i++)
    		for(int j=1; j<=l1; j++){
				if(dptable[i-1][j] ==0 && dptable[i][j-1]==0)
					dptable[i][j] = 0;
				else if(dptable[i-1][j]==1){
					if(s3.charAt(i+j-1)==s2.charAt(i-1)){
						dptable[i][j] = 1;
						continue;
					}
				}
				else if(dptable[i][j-1]==1){
					if(s3.charAt(i+j-1)==s1.charAt(j-1)){
						dptable[i][j] = 1;
						continue;
					}
				}
				else
					dptable[i][j] =0 ;
			}
		
		return dptable[l2][l1]==1 ? true : false;
	}
}