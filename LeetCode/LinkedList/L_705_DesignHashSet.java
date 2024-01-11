package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

class L_705_DesignHashSet
{
    // HashSet will not have duplicate value

    // Approach 1: Use ArrayList for designing HashSet
    // List<Integer> list;
    // // List can have duplicate, so need to have checks in add function

    // public MyHashSet() {
    //     list = new ArrayList<>();
    // }

    // public void add(int key) {
    //     if(!contains(key)){
    //         list.add(key);
    //     }
    // }

    // public void remove(int key) {
    //         if(contains(key)){
    //             int KeyIndex = list.indexOf(key); // If key doesn not in the list, indexOf will return -1
    //             list.remove(KeyIndex); // remove takes index
    //         }
    // }

    // // O(n)
    // public boolean contains(int key) {
    //     return list.contains(key);
    // }

    List<Boolean> list;

    public L_705_DesignHashSet() {
        list = new ArrayList<>();
        for(int i=0;i <= 1000000;i++){
            list.add(false);
        }
    }

    public void add(int key) {
        list.set(key,true);// add will not replace the element, it will return false if it occurs
    }

    public void remove(int key) {
        // list.remove(key); // remove will move subsequent elements to left
        list.set(key,false);
    }

    // Time complexity  O(1)
    public boolean contains(int key){
        return list.get(key); // get works on index
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */