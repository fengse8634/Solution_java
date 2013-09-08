public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int count = 1<<n;
        
        for(int i=0;i<count;i++){
            result.add(i^(i>>1));
        }
        return result;
    }
}