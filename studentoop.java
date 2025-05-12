
public class studentoop {

    public static void main(String args[]) {
        student s1 = new student("ajit", 130, "mca", 1);
        System.out.println(s1.name);
        System.out.println(s1.roll);

    }
}

class student {
    String name;
    int roll;
    String course;
    int sem;

    String getname() {
        return this.name;
    }

    void setname(String name) {
        this.name = name;
    }

    int getroll() {
        return this.roll;
    }

    void setroll(int x) {
        this.roll = x;
    }

}

student(String names, int rolls, String course, int sem) {
    this.name = names;
    this.roll = rolls;
    this.course = course;
   this.sem = sem;
}