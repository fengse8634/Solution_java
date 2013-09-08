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
    public int maxPathSum(TreeNode root) {
        ArrayList<Integer> maxSum = new ArrayList<Integer>();
        maxSum.add(Integer.MIN_VALUE);
        getMaxSum(root,maxSum);
        return maxSum.get(0);
    }
    public int getMaxSum(TreeNode root, ArrayList<Integer> maxSum){
        if(root==null)
            return 0;
        //leftSum rightSum and curSum is the sum from this node
        //there is another one that can not be count as sum from this root because it 
        //add left and right. So we need additional value to remeber which one is larger
        int leftSum = getMaxSum(root.left,maxSum);
        int rightSum = getMaxSum(root.right,maxSum);
        int curSum = Math.max(root.val,Math.max(root.val+leftSum,root.val+rightSum));
        maxSum.add(0,Math.max(maxSum.get(0),Math.max(curSum,leftSum+rightSum+root.val)));
        return curSum;
    }
}