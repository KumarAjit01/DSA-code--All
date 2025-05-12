//import java.util.*;

public class maxel {
    public static int maxwealth(int matrix[][]) {
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            res = Math.max(sum, res);
        }

        return res;

    }

    public static void main(String args[]) {
        int matrix[][] = { { 2, 8, 7, 1 }, { 7, 1, 4, 3 }, { 1, 9, 9, 5 } };
        System.out.println(maxwealth(matrix));
    }
}
