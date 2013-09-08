public class Solution {
    public String addBinary(String a, String b) {
        char [] bufA = a.toCharArray();
        bufA.
        a.
        Hashmap<String,String> map = new Hashmap<String,String>();
        
        char [] bufB = b.toCharArray();
        StringBuffer res = new StringBuffer();
        int carry = 0;
        for(int i=bufA.length-1,j=bufB.length-1;i>=0 || j>=0;){
            int sum = carry;
            if(i >=0){
                sum += bufA[i]-'0';
                i--;
            }
            if(j >=0){
                sum += bufB[j]-'0';
                j--;
            }
            carry = sum/2;
            int digit = sum%2;
            res.insert(0,digit);
        }
        if(carry!=0)    res.insert(0,carry);
        return res.toString(); 
    }
}