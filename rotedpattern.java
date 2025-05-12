
public class rotedpattern {
    public static void rotated_half_pyramid(int n) {
        // outer
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        rotated_half_pyramid(9);
    }

}
