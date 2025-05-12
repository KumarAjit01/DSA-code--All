import java.util.*;

public class subarr {
    public static void subarray(int number[]) {
        // int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;
        int pair = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k]/* + " " + number[j] */);

                }
                pair++;
                System.out.println();
            }
            System.out.println();
            System.out.println("pair=" + pair);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.println("enter the number");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        subarray(number);
        sc.close();
    }

}
