/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<Interval>();
        int len = intervals.size();
        int i=0;
        for(;i<len;i++){
            if(intervals.get(i).start > newInterval.start)
                break;            
        }
        intervals.add(i,newInterval);
        i=0;
        len = len+1;
        for(;i<len-1;i++){
            Interval next = intervals.get(i+1);
            Interval cur = intervals.get(i);
            if(cur.end < next.start)
                res.add(cur);
            else{
                next.start = cur.start;
                if(cur.end > next.end)
                    next.end = cur.end;
            }
        }
        res.add(intervals.get(i));
        return res;
    }
}