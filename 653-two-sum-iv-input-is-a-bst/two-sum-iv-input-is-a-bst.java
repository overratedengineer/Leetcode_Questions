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
    boolean reverse;
   public BSTIterator(TreeNode root, boolean reverse) {
    this.reverse = reverse;
    TreeNode curr = root;
    while(curr!=null){
        st.push(curr);
        if(reverse){
            curr = curr.right;
        }else{
            curr = curr.left;
        }
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
     public int before() {
        TreeNode curr = st.pop();
        int v = curr.val;
        if(curr.left!=null){
            curr=curr.left;
        while(curr!=null){
        st.push(curr);
        curr=curr.right;
        }
        }
        return v;
    }
    
    public boolean hasNext() {
        return !st.empty();
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        BSTIterator b1 = new BSTIterator(root,false);
        BSTIterator b2 = new BSTIterator(root,true);
        int i=b1.next();int j=b2.before();
         while(i<j){
            if(i+j==k) return true;
            if(i+j<k){
               i=b1.next();
            } else {
                j=b2.before();
            }
         }
         return false;
    }
}