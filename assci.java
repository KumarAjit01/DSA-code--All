
public class assci {
    public static int sum(String s) {
        int count = 0;
        int sums = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            count = Math.abs((int) s.charAt(i) - (int) (s.charAt(i + 1)));
            sums = sums + count;

        }
        return sums;

    }

    // public static int sub(int arr[]) {
    // int total = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    // total = Math.abs(arr[i] - arr[i + 1]);

    // }
    // return total;
    // }

    public static void main(String args[]) {
        String s = "hello";

        System.out.println(sum(s));
    }

}
