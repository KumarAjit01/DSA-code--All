import java.util.*;

public class pair {
    public static void pairs(int number[]) {
        int pairs = 0;
        for (int i = 0; i < number.length; i++) {

            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ")");
                pairs++;

            }
            System.out.println();

        }
        System.out.println(pairs);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[8];
        System.out.println("enter the array length");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        pairs(number);
        sc.close();

    }

}
