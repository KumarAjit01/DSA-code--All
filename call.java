import java.util.*;

public class call {
    public static void swap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("print a=:" + a);
        System.out.println("print b=:" + b);
        sc.close();

    }

    public static void main(String args[]) {
        swap();

    }

}
