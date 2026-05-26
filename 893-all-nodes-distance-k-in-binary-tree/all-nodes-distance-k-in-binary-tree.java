class Solution {
    public void markParents(TreeNode root, HashMap<TreeNode, TreeNode> parent) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node.left != null) {
                parent.put(node.left, node);
                q.offer(node.left);
            }
            if(node.right != null) {
                parent.put(node.right, node);
                q.offer(node.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        markParents(root, parent);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> vis = new HashSet<>();
        q.offer(target);
        vis.add(target);
        int level = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            if(level == k) break;
            level++;
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if(node.left != null && !vis.contains(node.left)) {
                    vis.add(node.left);
                    q.offer(node.left);
                }
                if(node.right != null && !vis.contains(node.right)) {
                    vis.add(node.right);
                    q.offer(node.right);
                }

                if(parent.containsKey(node) && !vis.contains(parent.get(node))) {
                    vis.add(parent.get(node));
                    q.offer(parent.get(node));
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()) {
            ans.add(q.poll().val);
        }

        return ans;
    }
}