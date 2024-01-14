package LeetCode.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L_933_NumberOfRecentCalls {

    public static void main(String[] args){
        L_933_NumberOfRecentCalls obj = new L_933_NumberOfRecentCalls();
        List<Integer> res = new ArrayList<>();
        res.add(obj.ping(1));
        res.add(obj.ping(100));
        res.add(obj.ping(3001));
        res.add(obj.ping(3002));

        System.out.println("res: "+res);

    }


    Queue<Integer> queue;
    public   L_933_NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        int[] range = new int[2];
        range[0] = t-3000;
        range[1] = t;
//        int counter = queue.size();
//        for(Integer i:queue){
//            if( i < range[0] || i > range[1]){
//                counter--;
//            }
//        }

            int counter = 0;
            for(Integer i:queue){
                if( i >= range[0] && i <= range[1]){
                    counter++;
                }
             }

        return counter;
    }
}
