public class new2 {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setTip(4);

        BankAccount myacc = new BankAccount();

        myacc.username="ajit";
        
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
        System.out.println(color);

    }

    void setTip(int newTip) {
        tip = newTip;
        System.out.println(tip);

    }
}


class BankAccount{
    public String username;
    
    private String password;

}


class Student {
    String name;
    int age;
    float percentage;

    void calper(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;

    }
}