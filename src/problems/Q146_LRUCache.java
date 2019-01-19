package problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Q146_LRUCache {

    private int capacity;
    private Map<Integer, Integer> cache;
    private Queue<Integer> accessOrder;

    public Q146_LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.accessOrder = new LinkedList<>();
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            accessOrder.remove(key);
            accessOrder.add(key);
            return cache.get(key);
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            accessOrder.remove(key);
        } else if (cache.size() >= capacity) {
            int lastKey = accessOrder.poll();
            cache.remove(lastKey); 
        } 
        cache.put(key, value);
        accessOrder.add(key);
    }

}
