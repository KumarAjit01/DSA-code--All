package RUCURSION;

public class fibbonacci {
    public static int findfibbo(int n) {
        if (n == 1 || n == 2)
            return 1;
        return findfibbo(n - 1) + findfibbo(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(findfibbo(4));

    }

}
