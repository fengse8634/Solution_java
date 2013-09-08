public class Solution {
    public int longestValidParentheses(String s) {

        int len = s.length();
        int res = 0;
        int last = -1;
        int cnt = 0;
        Stack<Integer> left = new Stack<Integer>();
        for(int i=0;i<len;i++){
            char temp = s.charAt(i);
            if(temp=='('){   
                left.push(i);
            }
            else if(temp==')'){
                if(!left.empty()){
                    left.pop();
                    if(left.empty()){
                        cnt=i-last;
                    }
                    else{
                        cnt = i-left.peek();
                    }
                }
                else{ 
                    last = i;
                }
            }
            res = res > cnt ? res : cnt;          
        }
        return res;
    }
}