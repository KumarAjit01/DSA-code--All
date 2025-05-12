import java.util.*;

public class newbina {
    public static int binary(int marks[], int key) {
        int start = 0, end = marks.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] > key) {
                start = mid + 1;
            } else {
                start = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("enter the key");
        int key = sc.nextInt();
        // int key = 4;
        System.out.println("index" + binary(marks, key));
        sc.close();
        

        

    }

}
