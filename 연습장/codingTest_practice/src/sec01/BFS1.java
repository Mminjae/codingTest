package sec01;

import java.util.*;

public class BFS1 {
    public void bfs(List<List<Integer>> graph,int startVertex) {
        //시작점 예약
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(startVertex);
        visited.add(startVertex);
        //queue가 비어있을 때까지 반복
        while (!queue.isEmpty()) {
            int curVertex = queue.remove();
            for (int nextVertex : graph.get(curVertex)) {
                if (!visited.contains(nextVertex)) {
                    queue.add(nextVertex);
                    visited.add(nextVertex);
                }
            }
        }
    }

    public void solve(List<List<Integer>> graph) {
        
    }
}
