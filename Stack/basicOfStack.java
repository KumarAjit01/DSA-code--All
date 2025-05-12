package Stack;

import java.util.Stack;

public class basicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(11);
        // System.out.println(st);
        // System.out.println(st.pop());
        // System.out.println(st);
        // System.out.println(st.peek());
        // System.out.println(st);
        // System.out.println("size of stack" + st.size());
        System.out.println(st);
        while (st.size() > 1) {
            st.pop();
        }
        System.err.println("First element of the stack is: " + st.peek());
        System.out.println(st);

    }

}
