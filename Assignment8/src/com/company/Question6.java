

//Tried on LeetCode
//Time Complexity = O(N)
//Space Complexity =O(N)
package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Question6 {
    class Solution {
        private static final int[][] directions =
                new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        public int shortestPathBinaryMatrix(int[][] grid) {
            if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0) {
                return -1;
            }
            Queue<int[]> queue = new ArrayDeque<>();
            grid[0][0] = 1;
            queue.add(new int[]{0, 0});
            while (!queue.isEmpty()) {
                int[] cell = queue.remove();
                int row = cell[0];
                int col = cell[1];
                int distance = grid[row][col];
                if (row == grid.length - 1 && col == grid[0].length - 1) {
                    return distance;
                }
                for (int[] neighbour : getNeighbours(row, col, grid)) {
                    int neighbourRow = neighbour[0];
                    int neighbourCol = neighbour[1];
                    queue.add(new int[]{neighbourRow, neighbourCol});
                    grid[neighbourRow][neighbourCol] = distance + 1;
                }
            }
            return -1;
        }

        private List<int[]> getNeighbours(int row, int col, int[][] grid) {
            List<int[]> neighbours = new ArrayList<>();
            for (int i = 0; i < directions.length; i++) {
                int newRow = row + directions[i][0];
                int newCol = col + directions[i][1];
                if (newRow < 0 || newCol < 0 || newRow >= grid.length
                        || newCol >= grid[0].length
                        || grid[newRow][newCol] != 0) {
                    continue;
                }
                neighbours.add(new int[]{newRow, newCol});
            }
            return neighbours;
        }
    }
}
