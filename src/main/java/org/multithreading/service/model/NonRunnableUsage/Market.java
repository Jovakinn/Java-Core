package org.multithreading.service.model.NonRunnableUsage;

public class Market {
    private Integer breadCounter = 0;

    public synchronized void getBread() {
        while (breadCounter < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCounter--;
        System.out.println("Consumer bought 1 bread");
        System.out.println("Amount of bread in the market " + breadCounter);
        notify();
    }

    public synchronized void putBread() {
        while (breadCounter >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCounter++;
        System.out.println("Developer added 1 bread");
        System.out.println("Amount of bread in the market = " + breadCounter);
        notify();
    }
}
