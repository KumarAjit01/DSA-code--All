public class uniq {
    public static int find(int num[]) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res = num[i] ^ res;

        }
        return res;
    }

    public static int get(int num) {
        int bitmask=1<<0;
        return ~num;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(get(n));

    }

}
