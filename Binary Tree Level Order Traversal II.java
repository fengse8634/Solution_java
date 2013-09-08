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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> buf = new LinkedList<TreeNode>();
        if(root==null)  return res;
        buf.add(root);
        ArrayList<Integer> levelBuf = new ArrayList<Integer>();
        int cnt =1;
        while(!buf.isEmpty()){
            TreeNode temp = buf.remove();
            levelBuf.add(temp.val);
            cnt--;
            if(temp.left!=null){
                buf.add(temp.left);
            }
            if(temp.right!=null){
                buf.add(temp.right);
            }
            if(cnt==0){
                cnt = buf.size();
                res.add(levelBuf);
                levelBuf = new ArrayList<Integer>();
            }
        }
        Collections.reverse(res);
        return res;
    }
}