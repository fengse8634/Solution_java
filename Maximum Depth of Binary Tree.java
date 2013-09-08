public class Solution {
    public int maxDepth(TreeNode root) {
        if(root!=null){
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return left > right ? left +1 : right+1;
        }
        else return 0;
    }
}
