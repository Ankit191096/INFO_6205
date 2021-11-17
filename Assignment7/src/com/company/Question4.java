package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


// Tried On LeetCode
//Time Complexity = O(M)
//Space Complexity = O(N)
public class Question4 {
    class Solution {
        public List<String> findWords(char[][] board, String[] words) {
            HashSet<String> res = new HashSet<>();

            for(String word: words){
                boolean[][] visited = new boolean[board.length][board[0].length];

                int count = 0;

                for(int i=0; i<board.length; i++){
                    for(int j=0; j<board[0].length; j++){
                        if(board[i][j] == word.charAt(0) && dfs(board, i, j, count, word, visited)){
                            res.add(word);
                            break;
                        }
                    }
                }
            }
            List<String> ans = new ArrayList<>(res);

            return ans;
        }

        public boolean dfs(char[][] board, int i, int j, int count, String word, boolean[][] visited){
            if(count == word.length())
                return true;

            if(i<0 || i>=board.length || j<0 || j>=board[0].length ||
                    board[i][j] != word.charAt(count) || visited[i][j])
                return false;

            visited[i][j] = true;

            boolean found = dfs(board, i-1, j, count+1, word, visited) ||
                    dfs(board, i, j+1, count+1, word, visited) ||
                    dfs(board, i+1, j, count+1, word, visited) ||
                    dfs(board, i, j-1, count+1, word, visited);

            visited[i][j] = false;

            return found;
        }
    }
}
