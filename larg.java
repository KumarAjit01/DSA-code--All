import java.util.*;

public class larg {
    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int number[] = { 3, 4, 12, 5, 6, 7, 8, 9, 15 };
        int lar1 = getlargest(number);
        System.out.println("largest" + lar1);
    }

}
