/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
     Stack<TreeNode> st= new Stack<>();
    public BSTIterator(TreeNode root) {
        TreeNode curr = root;
        while(curr!=null){
        st.push(curr);
        curr=curr.left;
        }
    }
    
    public int next() {
        TreeNode curr = st.pop();
        int v = curr.val;
        if(curr.right!=null){
            curr=curr.right;
        while(curr!=null){
        st.push(curr);
        curr=curr.left;
        }
        }
        return v;
    }
    
    public boolean hasNext() {
        return !st.empty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */