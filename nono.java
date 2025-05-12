public class nono {
    public static boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] == 0) {
                return false;

            } else if (grid[i][grid.length - i - 1] == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 0, 0, 2 } };
        System.out.println(checkXMatrix(matrix));
    }

}
