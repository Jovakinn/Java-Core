package org.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("O");
        deque.addFirst("L");
        deque.addLast("X");

        System.out.println(deque.stream().filter(a -> a.equals("L")).count());
        System.out.println(deque.stream().filter(element -> element.contains("X")).count());
        System.out.println(deque);
    }
}
