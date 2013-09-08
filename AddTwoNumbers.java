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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode node = head;
        while(l1!=null || l2!=null){
            int sum = carry;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            int digit = sum%10;
            carry = sum/10;
            ListNode next  = new ListNode(digit);
            node.next = next;
            node = next;
        }
        if(carry!=0){
            ListNode end = new ListNode(carry);
            node.next = end;
        } 
        return head.next;
    }
}