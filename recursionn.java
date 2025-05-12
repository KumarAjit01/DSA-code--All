public class recursionn {
    public static void printdes(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printdes(n - 1);

    }

    public static void print(int n) {
        if (n > 0) {
            System.out.println(n);
            print(n - 1);
        }
    }

    public static void printplus(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printplus(n + 1);

    }

    public static void main(String args[]) {
        int n = 1;
        printplus(n);
    }

}
