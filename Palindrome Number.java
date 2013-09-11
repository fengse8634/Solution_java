public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)   return false;
        int divide = 1;
        while(x/divide>=10){
            divide*=10;
        }

        while(x!=0){
            int lastD = x%10;
            int firstD = x/divide;
            if(lastD != firstD){
                return false;
            }
            x= (x%divide)/10;
            divide = divide/100;
        }
        return true;
    }
}