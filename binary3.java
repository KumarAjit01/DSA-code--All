public class binary3 {
    public static int binarysearch(int marks[], int key) {
        int start = 0;
        int end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] > key) {
                start = mid + 1;
            } else {
                start = mid = 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = { 15, 17, 19, 21, 23, 15, 27, 29 };
        int key = 27;
        int index = binarysearch(marks, key);

        System.out.println("index=" + index);
    }

}
