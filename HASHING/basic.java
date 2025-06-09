package HASHING;

import java.util.*;

public class basic {
    public static void main(String[] args) {

        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        // get
        int p = hm.get("India");
        System.out.println("get function" + p);
        // conatain
        System.out.println(hm.containsKey("Pakistan"));
        // remove
        System.out.println(hm.remove("china"));

        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm);
    }

}
