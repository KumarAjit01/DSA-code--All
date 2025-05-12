public class rec {
    /*
     * public static void printdec(int n) {
     * if (n == 1) {
     * System.out.println(n);
     * return;
     * }
     * System.out.print(n + " ");
     * printdec(n - 1);
     * }
     */

    public static void printinc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printinc(n - 1);
        System.out.print(n + " ");

    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean issortedarr(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issortedarr(arr, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 4, 5, 6, 7, 8 };

        System.out.println(issortedarr(arr, 0));
    }

}
