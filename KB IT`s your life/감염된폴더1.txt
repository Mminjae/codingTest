import java.util.*;

class Solution {
    private Map<String, List<String>> tree;
    private String p;
    private String q;

    public String solution(String[][] folders, String p, String q) {
        this.tree = new HashMap<>();
        this.p = p;
        this.q = q;


        // 트리구현 (인접리스트)
         for (String[] folder : folders){
             String parent = folder[0];
             String child = folder[1];
             tree.putIfAbsent(parent, new ArrayList<>());
             tree.get(parent).add(child);
         }
        return dfs("root");
    }

    // 깊이 우선 탐색(후위 순회)
    private String dfs(String node) {
        if (node.equals(p) || node.equals(q)) {
            return node;
        }

        List<String> found = new ArrayList<>();

        // 자식 노드 DFS 탐색
        List<String> children = tree.getOrDefault(node, new ArrayList<>());
        for (String child : children) {
            String res = dfs(child);
            if (res != null) {
                found.add(res);
            }
        }

        //dfs 탐색 결과에 따라 적절한 값 반환
        if (found.size() == 2) {
            return node;
        }
        if (found.size() == 1) {
            return found.get(0);
        }
        return null;
    }
}