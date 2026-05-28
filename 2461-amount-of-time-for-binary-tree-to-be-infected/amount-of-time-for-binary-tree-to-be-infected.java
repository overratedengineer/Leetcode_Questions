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

    HashMap<TreeNode, TreeNode> parent = new HashMap<>();

    public int amountOfTime(TreeNode root, int start) {

        TreeNode startNode = buildParent(root, start);

        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();

        q.offer(startNode);
        visited.add(startNode);

        int time = -1;

        while (!q.isEmpty()) {

            int size = q.size();
            time++;

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.offer(curr.left);
                }

                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.offer(curr.right);
                }

                TreeNode par = parent.get(curr);

                if (par != null && !visited.contains(par)) {
                    visited.add(par);
                    q.offer(par);
                }
            }
        }

        return time;
    }

    public TreeNode buildParent(TreeNode root, int start) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        TreeNode startNode = null;

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            if (curr.val == start) {
                startNode = curr;
            }

            if (curr.left != null) {
                parent.put(curr.left, curr);
                q.offer(curr.left);
            }

            if (curr.right != null) {
                parent.put(curr.right, curr);
                q.offer(curr.right);
            }
        }

        return startNode;
    }
}