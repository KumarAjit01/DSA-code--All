package OOPS;

public class Studentclass {
    // creating a new datatype
    public static class student {
        String name;
        int rno;
        double percent;
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Ajit";
        s1.rno = 130;
        s1.percent = 66.6;
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);

    }

}
