import java.util.*;

public class oneadd {
    public static void upadte(int marks[], int nonchangeable) {
        for (int i = 0; i < 3; i++) {
            marks[i] = marks[i] + 1;
        }
        nonchangeable = 10;
        for (int i = 0; i < 3; i++) {
            System.out.println("the marks of all student" + marks[i] + " ");
        }
        // System.out.println(nonchangeable);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[6];
        System.out.println("enter the six student marks");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
        int nonchangeable = 23;
        System.out.println(nonchangeable);

        upadte(marks, nonchangeable);
        /*
         * for (int i = 0; i < 3; i++) {
         * System.out.println("the marks of all student" + marks[i] + " ");
         * }
         */

    }
}
