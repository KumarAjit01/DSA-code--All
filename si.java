import java.util.*;

public class si {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");
        int amount = sc.nextInt();
        System.out.println("enter time");
        int time = sc.nextInt();
        System.out.println("enter rate ");
        int rate = sc.nextInt();
        int si = (amount * rate * time) / 100;
        System.out.println("the si=" + si);
        sc.close();

    }

}
