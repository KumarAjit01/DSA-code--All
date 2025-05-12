package RUCURSION;

// print n number in increasing and deceasing order 5 4 3 2 1 1 2 3 4 5 
public class inc_dec {
    public static void incDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        incDec(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        int n = 5;
        incDec(n);
    }

}
