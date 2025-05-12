package Stack;

//copy contents of one stack to another  in same order
import java.util.Stack;

public class copy {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // Reverse
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            rt.push(x);
            st.pop();

        }
        System.out.println(rt);
        while (rt.size() > 0) {
            int x = rt.peek();
            st.push(x);
            rt.pop();

        }
        System.out.println(st);

    }

}
