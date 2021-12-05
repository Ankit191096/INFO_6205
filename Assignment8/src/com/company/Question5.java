

//Time Complexity = O(M+N)
//Space Complexity = O(M+N)
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Question5 {
    class Solution {
        public int countComponents(int n, int[][] edges) {
            List<Integer>[] graph = new List[n];
            for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
            for (int[] e : edges) {
                graph[e[0]].add(e[1]);
                graph[e[1]].add(e[0]);
            }
            int components = 0;
            boolean[] visited = new boolean[n];
            for (int v = 0; v < n; v++) components += dfs(v, graph, visited);
            return components;
        }
        int dfs(int u, List<Integer>[] graph, boolean[] visited) {
            if (visited[u]) return 0;
            visited[u] = true;
            for (int v : graph[u]) dfs(v, graph, visited);
            return 1;
        }
    }
}
