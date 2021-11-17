package com.company;


// Tried On LeetCode
//Time Complexity = O(N)
//Space Complexity =O(N)
public class Question2 {
    class Solution {
        int count = 0;
        public int countArrangement(int n) {
            boolean[] visited = new boolean[n + 1];
            cal(n, 1, visited);
            return count;
        }

        public void cal(int n, int pos, boolean[] visited) {
            if (pos > n)
                count++;
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                    visited[i] = true;
                    cal(n, pos + 1, visited);
                    visited[i] = false;
                }
            }
        }
    }
}
