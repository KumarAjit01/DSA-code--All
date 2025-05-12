import java.util.*;

public class cal {
    public static void main(string args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first value");
        int a = sc.nextInt();
        System.out.println("enter your second value");
        int b = sc.nextInt();
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
        }
        sc.close();

    }
}