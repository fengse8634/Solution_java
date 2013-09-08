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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      //  Hashtable <Integer,Integer> map = new Hashtable <Integer,Integer>();
   //     for(int i=0;i<inorder.length;i++){
     //       map.put(inorder[i],i);    
      //  }
        if(inorder.length==0 || inorder.length!=postorder.length)   return null;
        return helper(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    
    }
    
    public TreeNode helper(int[] inorder, int[] postorder,int inorderS, int inorderE, int postorderS, int postorderE){
        if(inorderS > inorderE || postorderS > postorderE)  return null;
        TreeNode root = new TreeNode(postorder[postorderE]);
        int pos = 0;
        for(int i=inorderS;i<=inorderE;i++){
            if(inorder[i]==postorder[postorderE]){
                pos = i;
                break;
            }
        }
        int leftSize = pos - inorderS;
        int rightSize = inorderE - pos;
        if(leftSize > 0)
            root.left = helper(inorder,postorder,inorderS,inorderS+leftSize-1,postorderS,postorderS+leftSize-1);
        if(rightSize > 0)
            root.right = helper(inorder,postorder,pos+1,pos+rightSize,postorderS+leftSize,postorderS+leftSize+rightSize-1);
        return root;
    }
}