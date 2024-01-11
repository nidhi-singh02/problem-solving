package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    // HashSet will not have duplicate value

    // Approach 1: Use ArrayList for designing HashSet
    List<Integer> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if(!contains(key)){
            list.add(key);
        }
    }

    public void remove(int key) {
        if(contains(key)){
            int KeyIndex = list.indexOf(key);
            list.remove(KeyIndex); // remove takes index
        }
    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */