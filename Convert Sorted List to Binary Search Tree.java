/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)  return null;
        ListNode node = head;
        int high = 0;
        while(node!=null){
            high++;
            node = node.next;
        }
        return helper(head, 0,high-1);
    }
    public TreeNode helper(ListNode head, int low, int high){
        if(low >  high) 
            return null;
        int mid = (low+high)/2;
        TreeNode left = helper(head,low,mid-1);
        TreeNode node = new TreeNode(head.val);
        node.left = left;
        if(head.next!=null){
            head.val = head.next.val;
            head.next = head.next.next;
        }
        TreeNode right = helper(head,mid+1,high);
        node.right = right;
        return node;
    }
}