public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Helper(root,res);
        return res;
    }
    
    public void Helper(TreeNode root, ArrayList<Integer> res){
        if(root==null)  return;
        Helper(root.left,res);
        res.add(root.val);
        Helper(root.right,res);
    }
    
    public class Solution {
        public ArrayList<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            Stack<TreeNode> buf = new Stack<TreeNode>();
            
            while(true){
                while(root!=null){
                    buf.push(root);
                    root = root.left;
                }
                if(buf.empty()) break;
                TreeNode node = buf.peek();
                buf.pop();
                res.add(node.val);
                root = node.right;
            }
            return res;
        }
    }
}