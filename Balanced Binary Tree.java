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
    public boolean isBalanced(TreeNode root) {
        if(root==null)  return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right)) return true;
        else return false; 
    }
    public int getHeight(TreeNode root){
        if(root==null) return 0;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}