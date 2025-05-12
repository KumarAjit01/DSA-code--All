public class opertion {
    public static int opertions(String str[]) {
        int x = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(1) == '+') {
                x++;

            } else {
                x--;
            }

        }
        return x;
    }

    public static void main(String args[]) {
        String arr[] = { "--X", "X++", "X++" };
        System.out.println(opertions(arr));
    }
}
