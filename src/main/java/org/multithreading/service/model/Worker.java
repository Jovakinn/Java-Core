package org.multithreading.service.model;

import java.util.logging.Logger;

public class Worker implements Runnable {

    private final static Logger LOG = Logger.getLogger(Worker.class.getName());

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

        LOG.info(String.valueOf(thread.getState()));
        thread.start();

        LOG.info(String.valueOf(thread.getState()));
        thread.join(1500);

        LOG.info(String.valueOf(thread.getState()));
        System.out.println("Main thread ended");
    }
}
