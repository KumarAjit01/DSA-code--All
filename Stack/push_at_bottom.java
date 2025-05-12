package Stack;

import java.util.Stack;

public class push_at_bottom {
    public static void addElement(Stack<Integer> sc, int data) {
        if (sc.isEmpty()) {
            sc.push(data);
            return;
        }

        int top = sc.pop();
        addElement(sc, data);
        sc.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(21);
        addElement(sc, 87);
        while (!sc.isEmpty()) {
            System.out.print(sc.pop() + " ");
        }
    }

}
