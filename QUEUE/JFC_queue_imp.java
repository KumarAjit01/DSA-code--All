package QUEUE;

import java.util.*;

//read ArrayQueue and linkedlist quesue;
public class JFC_queue_imp {
    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());

        }
    }

}
