class student {
    String name;

    void info() {
        System.out.println("i am eating mango");
    }
}

class deta extends student {

    void info() {
        System.out.println("i am king");
    }

}

public class or {
    public static void main(String[] args) {
        deta d = new deta();
        d.info();

    }

}
