public class Solution {
    public String countAndSay(int n) {
        String [] buf = new String[n+1];
        buf[1] = new String("1");
        return helper(n,buf);
    }
    
    public String helper(int n, String [] buf){
        if(buf[n]!=null)    return buf[n];
        StringBuffer parse = new StringBuffer(helper(n-1,buf));
        StringBuffer res = new StringBuffer();
        int cnt = 1;
        int i=1;
        for(;i<parse.length();i++){
            if(parse.charAt(i)==parse.charAt(i-1))
                cnt++;
            else{
                res.append(cnt);
                res.append(parse.charAt(i-1));
                cnt =1 ;
            }
        }
        res.append(cnt);
        res.append(parse.charAt(i-1));
        buf[n] = new String(res.toString());
        return res.toString();
    }
}





public class Solution {
    public String countAndSay(int n) {
        StringBuffer parse = new StringBuffer();
        if(n==1)    {
            parse.append("1");
            return parse.toString();
        }
        else parse.append(countAndSay(n-1));
        StringBuffer res = new StringBuffer();
        int cnt = 1;
        int i=1;
        for(;i<parse.length();i++){
            if(parse.charAt(i)==parse.charAt(i-1))
                cnt++;
            else{
                res.append(cnt);
                res.append(parse.charAt(i-1));
                cnt =1 ;
            }
        }
        
        res.append(cnt);
        res.append(parse.charAt(i-1));
        return res.toString();
    }
}