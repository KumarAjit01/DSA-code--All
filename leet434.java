public class leet434 {
    public static int cheack(String str) {
        String name[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "my name is ajit kumar";
        System.out.println(cheack(str));
    }

}
