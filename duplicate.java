import java.util.*;

public class duplicate {
    public static void remove(int num[]) {
        int temp[] = new int[num.length];
        int j = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1]) {
                temp[j++] = num[i];
            }
        }
        temp[j++] = num[num.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 2, 8, 4, 7, 3, 2, 5, 8, 7, 6, 1, 2, 3, 5, 4, 3, 2, 2 };
        Arrays.sort(arr);
        remove(arr);

    }

}
