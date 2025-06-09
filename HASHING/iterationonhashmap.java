package HASHING;

import java.util.*;

public class iterationonhashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Iterate
        Set<String> Keys = hm.keySet();

        System.out.println(Keys);

        for (String k : Keys) {
            System.out.println("key= " + k + " values= " + hm.get(k));

        }
    }

}
