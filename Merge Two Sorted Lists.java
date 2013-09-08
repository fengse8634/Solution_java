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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode cur = head;
        while(l1!=null || l2!=null){
            ListNode temp = null;
            if(l1!=null){
                if(l2!=null){
                    if(l1.val <=l2.val){
                        temp = l1;
                        l1 = l1.next;
                    }
                    else{
                        temp = l2;
                        l2 = l2.next;
                    }
                }
                else{
                    temp = l1;
                    l1 = l1.next;
                }
            }
            else{
                temp = l2;
                l2 = l2.next;
            }
            
            if(head==null){
                head = temp;
                cur = temp;
            }
            else{
                cur.next = temp;
                cur = cur.next;
            }
            
        }
        return head;
    }
}