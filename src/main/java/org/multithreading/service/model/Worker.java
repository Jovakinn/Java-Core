package org.multithreading.service.model;

public class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work began");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ended");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        thread.start();
        thread.join(1500);
        System.out.println("Main thread ended");
    }
}
