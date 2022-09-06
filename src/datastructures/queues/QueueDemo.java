package datastructures.queues;

import java.util.LinkedList;
import java.util.Queue;

/*
* FIFO data structure
* offer() - add elements to the tail of the queue
* poll() - remove elements from the head of the queue
* peek() - view element at the head of the queue
* */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("Ram");
        q.offer("Shyam");
        q.offer("Jadhu");
        q.offer("Madhu");

        System.out.println(q);      // [Ram, Shyam, Jadhu, Madhu]

        String polledObject = q.poll();     // removing an object from head of queue
        System.out.println(polledObject);   // Ram

        q.poll();       // removing an object from head of queue

        System.out.println(q);      // [Jadhu, Madhu]

        String queueHead = q.peek();        // getting the head of queue
        System.out.println(queueHead);       // Jadhu
    }
}
