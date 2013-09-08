public class Solution {
    public String intToRoman(int num) {
        int [] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for(int i=0;num > 0 && i<nums.length;i++){
            int cnt = num/nums[i];
            num = num - cnt*nums[i];
            while(cnt>0){
                res.append(symbols[i]);
                cnt--;
            }
        }
        return res.toString();
        
    }
}