package ArrayList;

import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        // classname objectname= new classname();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // get operation
        // int element = list.get(0);
        // System.out.println(element);
        // remove elemnt
        // list.remove(1);
        // System.out.println(list);
        // System.out.println(list.contains(21));
        // list.add(1, 8);
        // System.out.println(list);
        list.set(3, 31);
        System.out.println(list);

    }

}
