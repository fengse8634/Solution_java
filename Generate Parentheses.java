public class Solution {
   public ArrayList<String> generateParenthesis(int n) {
    assert(n >= 0);
    if (n == 0) return new ArrayList<String>();
    ArrayList<String> result =  new ArrayList<String>();
    helper(n, 0, 0, new StringBuffer(),result);
    return result;
}

    private void helper(int n, int l, int r, StringBuffer buf, ArrayList<String> result) {
     //   ArrayList<String> result = new ArrayList<String>();
        if (l > n || r > n) {
            return;
        }
        if (r == n) {
            result.add(buf.toString());
            return;
        }
        if (l < n) {
            StringBuffer newBuf = new StringBuffer(buf);
            newBuf.append("(");
            helper(n, l + 1, r, newBuf,result);
        }
        if (r < l) {
            StringBuffer newBuf = new StringBuffer(buf);
            newBuf.append(")");
            helper(n, l, r + 1, newBuf,result);
        }   
    }
}