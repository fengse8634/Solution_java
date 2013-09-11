public class Solution {
    public String multiply(String num1, String num2) {
    	int l1 = num1.length();
		int l2 = num2.length();
		int [] buf = new int[l1+l2-1];
        for(int i1=l1-1;i1>=0;i1--){
        	for(int i2=l2-1;i2>=0;i2--){
        		buf[i1+i2] +=  (num1.charAt(i1)-'0') * (num2.charAt(i2)-'0');
        	}
        }
        int carry = 0;
        for(int i=l1+l2-2;i>=0;i--){
        	int num = buf[i]+carry;
        	buf[i] = num%10;
        	carry = num/10;
        }
        StringBuffer ret = new StringBuffer();
        while(carry!=0){
        	int digit = carry%10;
        	ret.insert(0, (char)(digit+'0'));
        	carry =  carry/10;
        }
        for(int i=0;i<buf.length;i++){
        	ret.append((char)(buf[i]+'0'));
        }
        if(ret.charAt(0)=='0') return "0";
        return ret.toString();
    }
}