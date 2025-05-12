package Backtracking;

public class permutation {
    public static void findPermutation(String str, String ans) {
        // base case

        if (str.length() == 0) {

            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde"=>"abc"+"de"="abbde"
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newstr, ans + curr);

        }

    }

    public static void main(String args[]) {
        String str = "ab";
        findPermutation(str, "");
    }

}
