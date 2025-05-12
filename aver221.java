import java.util.*;

public class aver221 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter first number");
        int b = sc.nextInt();
        System.out.println("enter first number");
        int c = sc.nextInt();

        int aver = a + b + c / 3;

        System.out.println("AVERAGE VALUE=" + aver);
        sc.close();

    }

}
