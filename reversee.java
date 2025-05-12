import java.util.*;

public class reversee {
    public static void reverse(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        int number[] = new int[6];
        for (int i = 0; i < 6; i++) {
            number[i] = sc.nextInt();

        }
        reverse(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
        sc.close();
    }

}
