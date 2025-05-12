public class Oops {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setcolor("black");
        System.out.println(p1.getcolor());
        p1.settip(5);

        System.out.println(p1.gettip());
        // p1.setcolor("yellow");
        p1.setcolor("red");
        System.out.println(p1.getcolor());
        // p1.color = "red";
        BankAccount myAcc = new BankAccount();
        myAcc.username = "ajit";
        myAcc.setPassword("abccjf");

    }

}

class BankAccount {
    public String username;
    private String Password;

    public void setPassword(String pwd) {
        Password = pwd;
    }

}

class Pen {
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setcolor(String newcolor) {
        this.color = newcolor;

    }

    void settip(int tip) {
        this.tip = tip;
    }
}