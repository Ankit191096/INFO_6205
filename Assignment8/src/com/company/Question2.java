

//Tried on LeetCode
//Time Complexity = O(N * N)
//Space Complexity =O(N)
package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2 {
    class Solution {
        boolean found;
        boolean[] visited;
        public boolean validPath(int n, int[][] edges, int start, int end) {

            if(edges.length == 0 ) return true;

            found = false;
            Map<Integer, List<Integer>>  root = new HashMap();
            visited = new boolean[n+1];



            for(int i = 0 ; i < n ; i++){
                root.put(i,new ArrayList());
            }
            for(int[] edge : edges){
                root.get(edge[0]).add(edge[1]);
                root.get(edge[1]).add(edge[0]);
            }

            dfs(root,visited,start,end);
            return found;
        }


        void dfs(Map<Integer,List<Integer>> root, boolean[] visited, int start, int end){

            visited[start] = true;
            for(int i : root.get(start)){
                if(i == end){
                    found = true;
                    break;
                }
                if(!visited[i]){
                    dfs(root,visited,i,end);
                }
            }
        }
    }
}
