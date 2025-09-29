import java.util.*;

class Solution {
    public int numberOfComponents(int[][] properties, int k) {
        int n = properties.length;
        List<Set<Integer>> sets = new ArrayList<>();

        // Convert each row into a set of distinct integers
        for (int[] row : properties) {
            Set<Integer> s = new HashSet<>();
            for (int val : row) s.add(val);
            sets.add(s);
        }

        // Build graph adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intersect(sets.get(i), sets.get(j)) >= k) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        // Count connected components
        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(graph, visited, i);
            }
        }

        return components;
    }

    private int intersect(Set<Integer> a, Set<Integer> b) {
        int count = 0;
        for (int x : a) {
            if (b.contains(x)) count++;
        }
        return count;
    }

    private void dfs(List<List<Integer>> graph, boolean[] visited, int node) {
        visited[node] = true;
        for (int nei : graph.get(node)) {
            if (!visited[nei]) dfs(graph, visited, nei);
        }
    }
}
