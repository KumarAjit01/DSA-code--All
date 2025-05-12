public class oops1 {
    public static void main(String args[]) {
        student s1 = new student();
        s1.name = "ajit";
        s1.roll = 456;
        s1.password = "abc";

        student s2 = new student(s1);
        s2.password = "xyz";
        System.out.println(s2.name);

    }
}

class student {
    String name;
    int roll;
    String password;

    student() {

    }

    student(student s1) {
        this.name = s1.name;

        this.roll = s1.roll;
    }

    // student();
}
