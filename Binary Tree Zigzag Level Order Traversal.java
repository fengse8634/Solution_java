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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> stackNext = new Stack<TreeNode>();
        if(root!=null)  stack.push(root);
        boolean flag = false;
        ArrayList<Integer> temp = new ArrayList<Integer>();

        while(!stack.empty()){
            TreeNode node = stack.peek();
            stack.pop();
            temp.add(node.val);
            
            if(flag==false){
                if(node.left!=null)
                    stackNext.push(node.left);
                if(node.right!=null)
                    stackNext.push(node.right);
                
            }
            else{
                if(node.right!=null)
                    stackNext.push(node.right);
                if(node.left!=null)
                    stackNext.push(node.left);
            }
            if(stack.empty()){
                stack=stackNext;
                res.add(temp);
                temp = new ArrayList<Integer>();
                stackNext = new Stack<TreeNode>();
                flag = !flag;
            }
        }
        return res;
    }
}