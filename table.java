import java.util.*;

public class table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter your num");
        int num = sc.nextInt();
        // int add;
        for (int i = 1; i <= 10; i++) {
            int add = num * i;
            System.out.println(add);
        }
        sc.close();
    }

}
