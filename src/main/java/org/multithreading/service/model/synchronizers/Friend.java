package org.multithreading.service.model.synchronizers;

import java.util.concurrent.CountDownLatch;

public class Friend extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is ready to buy something.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
