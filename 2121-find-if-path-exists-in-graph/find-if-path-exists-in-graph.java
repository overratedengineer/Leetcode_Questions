class Solution {
    private int[] parent;
    private int[] size;

    private void makeSet(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    private int findSet(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]]; 
            x = parent[x];
        }
        return x;
    }

    private void union(int a, int b) {
        int rootA = findSet(a);
        int rootB = findSet(b);

        if (rootA == rootB) {
            return;
        }

        if (size[rootA] < size[rootB]) {
            parent[rootA] = rootB;
            size[rootB] = size[rootB] + size[rootA];
        } else {
            parent[rootB] = rootA;
            size[rootA] = size[rootA] + size[rootB];
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }

        makeSet(n);

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            union(u, v);
        }

        int rootS = findSet(source);
        int rootD = findSet(destination);

        return (rootS == rootD);
    }
}
