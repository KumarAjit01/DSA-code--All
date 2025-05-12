import java.util.*;

public class linear {
    public static int linear(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your key");
        int key = sc.nextInt();
        System.out.println("enter the six array elemnet");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int index = linear(arr, key);

        if (index == -1) {
            System.out.println("data not found");

        } else {
            System.out.println("data found" + index);
        }
        sc.close();

    }
}
