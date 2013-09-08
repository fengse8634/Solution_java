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
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length==0) return null;
        return helper(num,0,num.length-1);
        
    }
    public TreeNode helper(int[] num, int low, int high){
        if(low >  high) return null;
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = helper(num,low,mid-1);
        root.right = helper(num,mid+1,high);
        return root;
    }
}