public class arrprb2 {
    public static int index(int number[], int target) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int index1 = index(number, target);

        System.out.println(index1);

    }

}
