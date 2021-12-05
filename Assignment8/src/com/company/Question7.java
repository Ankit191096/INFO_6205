

//Tried on LeetCode
//Time Complexity = O(N)
//Space Complexity =O(N)
package com.company;

import java.util.ArrayDeque;

public class Question7 {
    class Solution {
        public int orangesRotting(int[][] grid) {
            Queue<Pair<Integer, Integer>> queue = new ArrayDeque();
            int freshOranges = 0;
            int ROWS = grid.length, COLS = grid[0].length;

            for (int r = 0; r < ROWS; ++r)
                for (int c = 0; c < COLS; ++c)
                    if (grid[r][c] == 2)
                        queue.offer(new Pair(r, c));
                    else if (grid[r][c] == 1)
                        freshOranges++;
            queue.offer(new Pair(-1, -1));
            int minutesElapsed = -1;
            int[][] directions = { {-1, 0}, {0, 1}, {1, 0}, {0, -1}};
            while (!queue.isEmpty()) {
                Pair<Integer, Integer> p = queue.poll();
                int row = p.getKey();
                int col = p.getValue();
                if (row == -1) {
                    minutesElapsed++;
                    if (!queue.isEmpty())
                        queue.offer(new Pair(-1, -1));
                } else {
                    for (int[] d : directions) {
                        int neighborRow = row + d[0];
                        int neighborCol = col + d[1];
                        if (neighborRow >= 0 && neighborRow < ROWS &&
                                neighborCol >= 0 && neighborCol < COLS) {
                            if (grid[neighborRow][neighborCol] == 1) {
                                grid[neighborRow][neighborCol] = 2;
                                freshOranges--;
                                queue.offer(new Pair(neighborRow, neighborCol));

                            }
                        }
                    }
                }
            }
            return freshOranges == 0 ? minutesElapsed : -1;
        }
    }
}
