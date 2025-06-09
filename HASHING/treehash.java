package HASHING;

import java.util.*;

public class treehash {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Banana", 50);
        tm.put("Apple", 100);
        tm.put("Mango", 70);
        tm.put("Orange", 60);

        // Print TreeMap (sorted by key)
        System.out.println(tm);
    }

}
