package org.multithreading.service.threads;

public class MyThread6 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName() + ". Thread priority = "
                + Thread.currentThread().getPriority());
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        }

    }

    public static void outputThread() throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread6());
        thread.start();
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName() + ". Thread priority = "
                + Thread.currentThread().getPriority());
        outputThread();
    }
}
