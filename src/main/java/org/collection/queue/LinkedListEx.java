package org.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.offer("Max");
        stringQueue.offer("Alexander");
        stringQueue.offer("James");
        stringQueue.offer("Chris");

        stringQueue.clear();
        System.out.println(stringQueue.peek());

        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
    }
}
