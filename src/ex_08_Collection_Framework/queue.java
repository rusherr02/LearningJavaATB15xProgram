package ex_08_Collection_Framework;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    static void main() {
        Queue q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add("kdbndk");

//        System.out.println(q.poll());
        System.out.println(q.peek());


        PriorityQueue pq = new PriorityQueue();
        ArrayDeque<String> dq = new ArrayDeque();
        dq.add("a");
        dq.add("b");
        System.out.println(pq.poll());

//        pq.add(null);



    }
}
