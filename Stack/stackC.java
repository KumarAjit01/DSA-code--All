package Stack;

import java.util.ArrayList;

public class stackC {
    public static class ajit {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            return list.get(list.size() - 1);
        }

    }

    public static void main(String args[]) {
        ajit s = new ajit();
        s.push(2);
        s.push(42);
        s.push(23);
        s.push(32);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }

}
