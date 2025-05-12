import java.util.*;

public class min {
    public static int getsmallest(int number[]) {
        int samllest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (samllest > number[i]) {
                samllest = number[i];
            }

        }
        return samllest;
    }

    public static void main(String args[]) {
        int number[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("The samllest value=" + getsmallest(number));
    }

}
