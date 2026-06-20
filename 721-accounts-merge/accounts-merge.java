import java.util.*;

public class ds {
    List<Integer> rank = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    List<Integer> par = new ArrayList<>();

    public ds(int n) {
        for (int i = 0; i < n; i++) {
            rank.add(0);
            size.add(1);  
            par.add(i);    
        }
    }

    public int findpar(int u) {
        if (par.get(u) == u) return u;
        int parent = findpar(par.get(u));
        par.set(u, parent);
        return parent;
    }

    public void unionBySize(int u, int v) {
        int pu = findpar(u);
        int pv = findpar(v);
        if (pu == pv) return;
        if (size.get(pu) < size.get(pv)) {
            par.set(pu, pv);
            size.set(pv, size.get(pv) + size.get(pu));
        } else {
            par.set(pv, pu);
            size.set(pu, size.get(pu) + size.get(pv));
        }
    }
}

class Solution {
    static List<List<String>> accountsMerge(List<List<String>> details) {
        int n = details.size();
        ds ds = new ds(n);
        HashMap<String, Integer> mapMailNode = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < details.get(i).size(); j++) {
                String mail = details.get(i).get(j);
                if (!mapMailNode.containsKey(mail)) {
                    mapMailNode.put(mail, i);
                } else {
                    ds.unionBySize(i, mapMailNode.get(mail));
                }
            }
        }

        ArrayList<String>[] mergedMail = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            mergedMail[i] = new ArrayList<String>();
        }

        for (Map.Entry<String, Integer> it : mapMailNode.entrySet()) {
            String mail = it.getKey();
            int node = ds.findpar(it.getValue());
            mergedMail[node].add(mail);
        }

        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (mergedMail[i].size() == 0) continue;
            Collections.sort(mergedMail[i]);
            List<String> temp = new ArrayList<>();
            temp.add(details.get(i).get(0));
            for (int j = 0; j < mergedMail[i].size(); j++) {
                temp.add(mergedMail[i].get(j));
            }
            ans.add(temp);
        }
        return ans;
    }
}
