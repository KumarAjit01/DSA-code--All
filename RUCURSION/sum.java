package RUCURSION;

//add  n number
public class sum {
    public static int print(int n) {
        if (n == 1) {
            return 1;
        }
        return n + print(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(print(3));

    }

}
