import java.util.*;

public class twopo {
    public static int[] firsts(int arr[]) {
        int n = arr.length;
        int first = 0;
        int last = n - 1;
        while (first < last) {
            if (arr[first] % 2 == 1 && arr[last] % 2 == 0) {
                int temp = arr[last];
                arr[last] = arr[first];
                arr[first] = temp;

            }
            if (arr[first] % 2 == 0) {
                first++;
            }
            if (arr[last] % 2 == 1) {
                last--;
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 number");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int result[] = firsts(array);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }

}
