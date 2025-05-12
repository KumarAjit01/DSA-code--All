import java.util.*;

public class rev {
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
        System.out.println("enter the 5 number");
        int number[] = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }
        sc.close();

    }

}
