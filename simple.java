import java.util.*;

public class simple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");
        int amount = sc.nextInt();
        System.out.println("enter rate");
        int rate = sc.nextInt();
        System.out.println("enter time");
        int time = sc.nextInt();
        int inter = (amount * rate * time) / 100;
        System.out.println("simple inter=" + inter);

    }

}
