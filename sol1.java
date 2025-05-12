public class Sol1 {

    public static int romanToInt(String s) {
        char i = 1, ii = 2, iii = 3, v = 5, vi = 6, vii = 7, viii = 8, ix = 9, x = 10, l = 50, c = 100, d = 500,
                m = 1000;
        int sum = 0;
        for (int k = 0; k < s.length(); k++) {
            char roman = s.charAt(k);
            if (roman == i) {
                sum = +i;
            } else if (roman == v) {
                sum = +v;
            } else if (roman == x) {
                sum = +x;
            } else if (roman == l) {
                sum = +l;
            } else if (roman == c) {
                sum = +c;
            } else if (roman == d) {
                sum = +d;
            } else if (roman == m) {
                sum = +m;
            }
        }

    }

    public static void main(String args[]) {
        String str = "LVIII";
    }

}