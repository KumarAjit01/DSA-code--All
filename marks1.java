
public class marks1 {
    public static void update(int marks1[]) {
        for (int i = 1; i <= marks1.length; i++) {
            marks1[i] = marks1[i] + 1;

        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        update(marks);
        for (int i = 0; i <= marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}
