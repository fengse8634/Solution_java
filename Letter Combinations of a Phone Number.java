public class Solution {
    private String [] numMap = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<String>();
        help(res,0,digits,new StringBuilder());
        return res;
    }
    
    public void help(ArrayList<String> res, int index, String digits,StringBuilder temp){
        if(temp.length()==digits.length()){
            res.add(temp.toString());
            return;
        }
        int num = digits.charAt(index)-'0';
        String buf = numMap[num];
        for(int i=0;i<buf.length();i++){
            temp.append(buf.charAt(i));
            help(res,index+1,digits,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    
}