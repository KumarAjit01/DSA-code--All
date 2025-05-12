import java.util.*;

public class triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter triangle");
        int triangle = sc.nextInt();
        int triangle2 = sc.nextInt();
        int triangle3 = sc.nextInt();
        // int sum = triangle + triangle2 + triangle3;
        if ((triangle == triangle2) && (triangle2 == triangle3)) {
            System.out.println("it is equlatral triangle");
        } else if ((triangle == triangle2) || (triangle == triangle3) || (triangle2 == triangle3)) {
            System.out.println("it is isoscels");
        } else {
            System.out.println("it is scalnce");

        }
        sc.close();
    }

}
