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
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res = new ArrayList<Interval>();
        int cnt = intervals.size();
        if(cnt<1)   return res;
        Comparator<Interval> comparator = new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                if(i1.start < i2.start)
                    return -1;
                else if(i1.start > i2.start)
                    return 1;
                else{
                    if(i1.end < i2.end){
                        return -1;
                    }
                    else if(i1.end > i2.end){
                        return 1;
                    }
                    else return 0;
                }
            }
            
        };
        Collections.sort(intervals, comparator);
        Interval temp = new Interval(intervals.get(0).start,intervals.get(0).end);
        for(int i=1;i<cnt;i++){
            if(intervals.get(i).start<=temp.end){
                if(intervals.get(i).end >= temp.end ){
                     temp.end = intervals.get(i).end;
                }
            }
            else{
                res.add(temp);
                temp = intervals.get(i);
            }
        }
        res.add(temp);
        return res;
        
    }
}