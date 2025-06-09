package HASHING;

import java.util.LinkedList;

public class MyHashMap<K, V> {

    // Node class to store key-value pairs
    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 16; // Default size
    private LinkedList<Node>[] buckets;
    private int count = 0;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function to get index
    private int getIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // put method
    public void put(K key, V value) {
        int index = getIndex(key);
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value; // update existing key
                return;
            }
        }
        buckets[index].add(new Node(key, value));
        count++;
    }

    // get method
    public V get(K key) {
        int index = getIndex(key);
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    // containsKey method
    public boolean containsKey(K key) {
        int index = getIndex(key);
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // remove method
    public void remove(K key) {
        int index = getIndex(key);
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) {
                buckets[index].remove(node);
                count--;
                return;
            }
        }
    }

    // size method
    public int size() {
        return count;
    }

    // Test the implementation
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        System.out.println("Apple: " + map.get("Apple")); // 10
        System.out.println("Contains 'Banana'? " + map.containsKey("Banana")); // true
        System.out.println("Size: " + map.size()); // 3

        map.remove("Banana");
        System.out.println("Contains 'Banana'? " + map.containsKey("Banana")); // false
        System.out.println("Size after remove: " + map.size()); // 2
    }
}
