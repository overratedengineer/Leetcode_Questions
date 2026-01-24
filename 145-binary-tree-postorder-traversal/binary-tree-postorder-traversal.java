class Solution {

    public List<Integer> pot(TreeNode root, List<Integer> al) {
        if (root == null) {
            return al;
        }

           
        pot(root.left, al);       
        pot(root.right, al);      
        al.add(root.val);    
        return al;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        return pot(root, al);
    }
}
