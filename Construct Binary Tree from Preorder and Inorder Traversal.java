/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 import java.util.*;
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length==0 || inorder.length!=preorder.length)   return null;
        return helper(inorder,preorder,0,inorder.length-1,0,preorder.length-1);
    
    }
    
    public TreeNode helper(int[] inorder, int[] preorder,int inorderS, int inorderE, int preorderS, int preorderE){
        if(inorderS > inorderE || preorderS > preorderE)  return null;
        TreeNode root = new TreeNode(preorder[preorderS]);
        int pos = 0;
        for(int i=inorderS;i<=inorderE;i++){
            if(inorder[i]==preorder[preorderS]){
                pos = i;
                break;
            }
        }
        int leftSize = pos - inorderS;
        int rightSize = inorderE - pos;
        if(leftSize > 0)
            root.left = helper(inorder,preorder,inorderS,inorderS+leftSize-1,preorderS+1,preorderS+leftSize);
        if(rightSize > 0)
            root.right = helper(inorder,preorder,pos+1,pos+rightSize,preorderS+leftSize+1,preorderE);
        return root;
    }
}