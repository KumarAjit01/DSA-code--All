package Heaps;

import java.util.*;

public class insert_in_heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public void printHeap() {
            System.out.println(arr);
        }

        public int peek() {
            return arr.get(0);
        }

    }

    public static void main(String[] args) {
        Heap heap = new Heap(); // Create an instance of Heap
        heap.add(10);
        heap.add(5);
        heap.add(20);
        heap.add(2);
        System.out.println(heap.peek());
        heap.printHeap(); // Check the heap structure

    }

}
