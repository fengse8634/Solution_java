/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        Comparator<ListNode> comparator = new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2){
                if(l1.val > l2.val)
                    return 1;
                else if(l1.val < l2.val)
                    return -1;
                else return 0;   
            }
        };
        int cnt = lists.size();
        ListNode head= null;
        if(cnt<1)   return head;
        if(cnt==1)  return lists.get(0);
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(cnt,comparator);
        for(int i=0;i<cnt;i++){
            ListNode temp = lists.get(i); 
            if(temp!=null)
                heap.add(temp);
        }
        ListNode cur = head;
        while(!heap.isEmpty()){
            ListNode peak = heap.poll();
            if(head==null){
                head = peak;
                cur = head;
            }
            else{
                cur.next = peak;
                cur = cur.next;
            }
            if(peak.next!=null)
                heap.add(peak.next);
        }
        return head;
    }
}