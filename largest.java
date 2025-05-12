import java.util.*;

public class largest {
    public static void printsubarry(int number[]) {
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("total ts=" + ts);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printsubarry(numbers);
    }

}
