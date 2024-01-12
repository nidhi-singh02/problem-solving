package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

class L_706_DesignHashMap {

    // Which Data structure to use - to store key and value
    // I can use array - where index will represent key and array elements will represent the value

    List<Integer> list;
    public L_706_DesignHashMap() {
        list = new ArrayList<>();
        for(int i=0;i <=1000000;i++){
            list.add(-1);
        }
    }

    public void put(int key, int value) {
        list.set(key,value); // To update the value if it exists
    }

    public int get(int key) {
        return list.get(key);
    }

    public void remove(int key) {
        list.set(key,-1); // Remove will remove the element and shift subsequent elements to left so index will change
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */