public class bin {
    public static int binarysearch(int number[], int key) {
        int start = 0, end = number.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        // int number[] = { 16, 14, 12, 10, 8, 6, 4, 2 };
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 2;
        System.err.println("the index" + binarysearch(number, key));
    }

}
