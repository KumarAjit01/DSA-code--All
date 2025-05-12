import java.util.*;

public class mul {
    public static int multi(int a, int b) {
        // int a, b;
        int prod = a * b;
        return prod;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a=");
        int a = sc.nextInt();
        System.out.println("b=");
        int b = sc.nextInt();
        int prod = multi(a, b);
        int prod1 = multi(5, 10);
        System.out.println("multip" + prod);
        System.out.println("multip" + prod1);
        sc.close();
    }
}
