import java.util.*;

public class cheack_alpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);
        if ((alpha >= 'a') && (alpha <= 'z')) {
            System.out.println("this is alpha");

        } else {
            System.out.println("this is not alpha");
        }
        sc.close();

    }

}
