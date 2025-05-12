package OOPS;

public class student {
    private static class Studentdetail {
        String name = "ajit";
        private int password;
        // System.out.println(password);

    }

    public static void main(String[] args) {
        Studentdetail s1 = new Studentdetail();

        System.out.println(s1.name);
        s1.password = 123;
        System.out.println(s1.password);

    }

}
