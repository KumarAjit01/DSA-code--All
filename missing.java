public class missing {
    public static int missingnumber(int num[]) {
        int len = num.length + 1;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            count = count + num[i];

        }
        int result = len * (len + 1) / 2;
        return result - count;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21 };
        System.out.println(missingnumber(num));
    }

}
