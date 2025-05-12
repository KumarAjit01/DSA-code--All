public class leet125 {

    public static boolean isPalindrome(String s) {

         String S = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(S);
        for (int i = 0; i < S.length() / 2; i++) {
            int n = S.length();
            if (S.charAt(i) != S.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

}
