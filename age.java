import java.util.*;

public class age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the first value ");
        int x = sc.nextInt();
        System.out.println("enter the second value");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("a is greater");
        } else if (y > x) {
            System.out.println("b is greater");
        } else {
            System.out.println("both numer is equal");
        }
        sc.close();

    }
}
