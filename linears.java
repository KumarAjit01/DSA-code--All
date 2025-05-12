import java.util.*;

public class linears {
    public static int linearseach(int number[], int key) {
        for (int i = 0; i < 3; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];
        System.out.println("enter your keys");
        int key = sc.nextInt();
        System.out.println("enter your number");
        for (int i = 0; i < 3; i++) {
            number[i] = sc.nextInt();
        }
        int index = linearseach(number, key);
        if (index == -1) {
            System.out.println("data not found");
        } else {
            System.out.println("data found and index num is=" + index);
        }
    }

}
