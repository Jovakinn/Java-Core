package org.multithreading.service;

import org.multithreading.service.threads.MyThread5;

public class ThreadService {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!!!");
            }
        }).start();
        new Thread(() -> System.out.println("hello!!!")).start();

        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("Alexei");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread5 = " + myThread5.getName() +
                "\nPriority: " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        myThread6.setName("Roman");
        myThread6.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Name of myThread6 = " + myThread6.getName() +
                "\nPriority: " + myThread6.getPriority());
    }
}