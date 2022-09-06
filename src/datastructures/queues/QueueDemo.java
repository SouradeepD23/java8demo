package datastructures.queues;

import java.util.LinkedList;
import java.util.Queue;

/*
* FIFO data structure
* offer() - add elements to the tail of the queue
* poll() - remove elements from the head of the queue
* peek() - view element at the head of the queue
* isEmpty() - checks if queue is empty
* size() - returns size of queue
* contains(E) - returns true if object E is present in queue else returns false
* */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        System.out.println(q.isEmpty());    // true
        System.out.println(q.size());       // 0

        q.offer("Ram");
        q.offer("Shyam");
        q.offer("Jadhu");
        q.offer("Madhu");

        System.out.println(q);      // [Ram, Shyam, Jadhu, Madhu]
        System.out.println(q.isEmpty());    // false
        System.out.println(q.size());       // 4

        String polledObject = q.poll();     // removing an object from head of queue
        System.out.println(polledObject);   // Ram

        q.poll();       // removing an object from head of queue

        System.out.println(q);      // [Jadhu, Madhu]

        String queueHead = q.peek();        // getting the head of queue
        System.out.println(queueHead);       // Jadhu
    }
}


/*
 * Uses of Queues:
 * 1. used in buffers (keyboard buffers)
 * 2. job queues (printer jobs)
 * 3. used linked lists, priority queues, BFS
 * */