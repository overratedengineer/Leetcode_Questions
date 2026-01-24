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
   
       

    public List<Integer> iot(TreeNode root, List<Integer> al) {
        if (root == null) {
            return al;
        }
        iot(root.left, al); 
        al.add(root.val);           
        iot(root.right, al);      

        return al;
    }

   public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        return iot(root, al);
    }
}

 