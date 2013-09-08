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
    public void flatten(TreeNode root) {
        if (root==null) return;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left!=null) {
            root.right = left;
            root.left = null;

            TreeNode rightmost = left;
            while(rightmost.right!=null) 
                {rightmost = rightmost.right;}
            rightmost.right = right; // point the right most to the original right child
        }
        flatten(root.right);
    }
}