package org.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2123213);
        priorityQueue.add(324);
        priorityQueue.add(1765);
        priorityQueue.add(12414125);

        priorityQueue.poll();
        System.out.println(priorityQueue.peek());
        priorityQueue.clear();
        System.out.println(priorityQueue);


    }
}
