class Solution {

    public List<Integer> pot(TreeNode root, List<Integer> al) {
        if (root == null) {
            return al;
        }

        al.add(root.val);       
        pot(root.left, al);       
        pot(root.right, al);      

        return al;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        return pot(root, al);
    }
}
