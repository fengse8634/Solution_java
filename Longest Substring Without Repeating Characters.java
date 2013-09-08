public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer>map = new HashMap<Character,Integer>();
        int len = s.length();
        int res = 0;
        int cnt = res;
        int begPos = 0;
        for(int i=0;i<len;i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                int prePos = map.get(temp);
                if(prePos >= begPos){
                   cnt = cnt -(prePos - begPos+1);
                   begPos=prePos+1;
                }
            }
            map.put(temp,i);
            cnt++;
            res = res > cnt ? res : cnt;
        }
        return res;
    }
}