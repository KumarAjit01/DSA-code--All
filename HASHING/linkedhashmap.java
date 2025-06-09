package HASHING;

import java.util.LinkedHashMap;

public class linkedhashmap {
    public static void main(String[] args) {
        // Create LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // put(key, value): Insert elements
        lhm.put("Apple", 100);
        lhm.put("Banana", 60);
        lhm.put("Mango", 120);
        lhm.put("Orange", 80);

        System.out.println("LinkedHashMap: " + lhm);

    }
}
