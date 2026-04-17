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
class Solution {
     
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {   
    List<List<Integer>>  al = new ArrayList<>();
     if(root==null) return al;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int flag =1;
    while(!q.isEmpty()){
        int s = q.size();
         List<Integer> l = new ArrayList<>();
        for(int i =0;i<s;i++){
           TreeNode n = q.remove();
           l.add(n.val);
           if(n.left!=null){
            q.add(n.left);
           }
           if(n.right!=null){
            q.add(n.right);
           }
        }
        if(flag==1){
            flag =0;
            al.add(l);
        } else {
            flag=1;
            Collections.reverse(l);
            al.add(l);
        }
        
    }
    return al;
    }
}