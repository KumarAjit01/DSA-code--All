public class xpower {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        /*
         * int xnm1 = power(x, n - 1);
         * int xn = xnm1 * x;
         * return xn;
         */
        return x * power(x, n - 1);
    }

    public static int tailingproblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tailingproblem(n - 1);
        int fnm2 = tailingproblem(n - 2);
        return fnm1 + fnm2;
    }

    public static void main(String args[]) {
        int x = 5;

        System.out.println(tailingproblem(x));
    }

}
