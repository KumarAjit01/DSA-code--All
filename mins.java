import java.util.*;

public class mins {
    public static void maxs(int number[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {

                max = number[i];
            }

        }
        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {

                min = number[i];
            }
        }
        System.out.println("max=" + max);
        System.out.println("min" + min);
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
        maxs(number);
        sc.close();

    }

}
