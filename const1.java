
class student {

    String name;
    int roll;

    student() {

    }

    student(String name) {
        this.name = name;

    }

    student(int roll) {
        this.roll = roll;
    }

    void print() {
        System.out.println(name);
        System.out.println(roll);
    }
}

public class const1 {
    public static void main(String args[]) {
        student s1 = new student();
        s1.name = "ajit";
        s1.roll = 121;
        s1.print();
    }

}
