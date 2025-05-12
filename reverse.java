//import java.util.*;

public class reverse {
    public static void reversenum(int number[]) {
        int first = 0, last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int number[] = { 2, 65, 33, 22, 67, 32, 78 };
        reversenum(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

}
