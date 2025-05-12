package Loop;

public class pattern {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("x ");

                for (int k = j; k <= 7 - i; k++) {
                    System.out.print(num + " ");
                    num++;
                }

            }
            System.out.println();
        }
    }

}
