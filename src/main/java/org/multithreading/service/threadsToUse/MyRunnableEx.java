package org.multithreading.service.threadsToUse;

import org.multithreading.service.model.Counter;

public class MyRunnableEx implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }

    public synchronized void increment() {
        Counter.count++;
        System.out.println(Counter.count + " ");
    }

    public static void doPreparatoryJobs() {
        System.out.println("Hooray!");
    }

    public static void doWork() {
        doPreparatoryJobs();
        synchronized(MyRunnableEx.class){
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    public static void main(String[] args) {
        MyRunnableEx myRunnableEx = new MyRunnableEx();
        Thread thread1 = new Thread(myRunnableEx);
        Thread thread2 = new Thread(myRunnableEx);
        Thread thread3 = new Thread(myRunnableEx);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
