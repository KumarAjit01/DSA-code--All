import java.util.*;

public class sub {
    public static void subarray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i + 1; j < number.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print(number[k] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[6];
        System.out.println("enter the six elemnt");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        subarray(number);
        sc.close();
    }

}
