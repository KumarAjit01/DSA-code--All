//import java.util.*;

public class submaxarray {
    public static void maxsubarray(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int currsum = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum = number[k] + currsum;
                }
                System.out.println(currsum);

            }
            if (largest < currsum) {
                largest = currsum;
            }
            if (smallest > currsum) {
                smallest = currsum;
            }
        }
        System.out.println("largest of the number" + largest);
        System.out.println("smallest of the number" + smallest);
    }

    public static void main(String args[]) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("array length");
         * int n = sc.nextInt();
         * System.out.println("enter number");
         * int number[] = new int[n];
         * for (int i = 0; i < number.length; i++) {
         * number[i] = sc.nextInt();
         * }
         */
        int number[] = { 1, -2, 6, -1, 3 };
        maxsubarray(number);
    }

}
