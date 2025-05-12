public class reursion {
    public static int findfactorial(int n) {
        if (n == 0)
            return 1;

        return findfactorial(n - 1) * n;

    }

    // fibonachi series
    public static int fibbo(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibbo(n - 1) + fibbo(n - 2);
    }

    // sum of digit
    public static int sumofDigit(int n) {
        if (n >= 0 && n <= 9)
            return n;
        return sumofDigit(n / 10) + n % 10;
    }

    // count the total digit
    public static int countofDigit(int n) {
        if (n >= 0 && n <= 9)
            return 1;
        return countofDigit(n / 10) + 1;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(countofDigit(n));
    }

}
