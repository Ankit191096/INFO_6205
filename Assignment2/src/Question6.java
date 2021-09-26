public class Question6 {


    //Time Complexity = O(n * m)
    //Space Complexity = O(M * N)
    public static void negativeNos(int[][] grid, int row, int column){
        row = grid.length;
        column = grid[0].length;
        int count= 0;
        for(int i = 0; i< row; i++){
            for(int j = 0; j< column; j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[][] grid={ {4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        negativeNos(grid, 4, 4);
    }
}
