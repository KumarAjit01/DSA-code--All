public class substring {
    public static String substr(String str, int si, int ei) {
        String substrings = "";
        for (int i = si; i < ei; i++) {
            substrings += str.charAt(i);
        }
        return substrings;
    }

    public static void main(String args[]) {
        String str = "helloworld";
        System.out.println(substr(str, 0, 5));
    }

}
