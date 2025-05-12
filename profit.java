import java.util.*;

public class profit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price");
        int cost = sc.nextInt();
        int selling = sc.nextInt();
        int amount = 0;
        if (selling > cost) {
            amount = selling - cost;
            double new_amount = amount + (amount * 0.18);
            System.out.println("your profite is=" + amount);
            System.out.println("your profite with 18% gst=" + new_amount);
        } else if (cost > selling) {
            amount = cost - selling;
            System.out.println("your losse is=" + amount);

        } else {
            System.out.println("you dont any profite and loose");
        }
        sc.close();
    }

}
