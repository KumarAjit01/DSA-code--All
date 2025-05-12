
public class blancedstring {
    public static boolean isBalanced(String num) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));

            if (i % 2 == 0) {
                even += digit;
            } else {
                odd += digit;
            }
        }
        return even == odd;

    }

    public static void main(String[] args) {
        String num = "1234";
        System.out.println(isBalanced(num));
    }

}
