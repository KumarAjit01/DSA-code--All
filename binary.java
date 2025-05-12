public class binary {
    public static int search(int marks[], int key) {
        int start = 0, end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] < key) {
                return mid;
            }
            if (marks[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = { 1, 3, 4, 5, 7, 12, 15, 16, 29, 45 };
        int key = 29;
        System.out.println(search(marks, key));
    }

}
