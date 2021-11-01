package org.multithreading.service.model.synchronizers;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Max", callBox);
        new Person("Oleh", callBox);
        new Person("Alex", callBox);
        new Person("Romeo", callBox);
        new Person("Charlie", callBox);
    }
}
