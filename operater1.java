//import java.util.*;

public class operater1 {
    public static void main(String args[]) {
        /*
         * int x = 200, y = 50, z = 100;
         * if (x > y && y > z) {
         * System.out.println("hello");
         * }
         * if (z > y && z < x) {
         * System.out.println("java");
         * }
         * if ((y + 200) < x && (y + 150) < z) {
         * System.out.println("hello java");
         * }
         * /*
         * int exp1 = (x * y / x);
         * int exp2 = (x * (y / x));
         * System.out.println(exp1 + " ,");
         * System.out.println(exp2);
         */
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);

    }

}
