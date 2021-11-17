package com.company;


// Tried On LeetCode
//Time Complexity = O(N)
//Space Complexity = O(L) length of the word
public class Question1 {
    class Solution {
        public boolean exist(char[][] board, String word) {
            char firstLetter = word.charAt(0);
            for (int m = 0; m < board.length; m++) {
                for (int n = 0; n < board[0].length; n++) {
                    if (board[m][n] == firstLetter) {
                        if (stringExists(m, n, word, 0, board, new int[board.length][board[0].length]))
                            return true;
                    }
                }
            }
            return false;
        }

        public boolean stringExists(int m, int n, String word, int index, char[][] board, int[][] visited) {
            if (visited[m][n] == 1)
                return false;
            if (word.charAt(index) == board[m][n]) {
                visited[m][n] = 1;
                if (index == word.length() - 1)
                    return true;

                int up = m - 1 < 0 ? 0 : m - 1;
                int down = m + 1 >= board.length ? board.length - 1 : m + 1;
                int left = n - 1 < 0 ? 0 : n - 1;
                int right = n + 1 >= board[0].length ? board[0].length - 1 : n + 1;
                if (stringExists(up, n, word, index + 1, board, visited)
                        || stringExists(down, n, word, index + 1, board, visited)
                        || stringExists(m, left, word, index + 1, board, visited)
                        || stringExists(m, right, word, index + 1, board, visited))
                    return true;
            }
            visited[m][n] = 0;
            return false;
        }
    }
}
