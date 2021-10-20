package org.multithreading.service.model;

public class VolatileModel extends Thread {
    volatile Boolean Boolean = true;

    @Override
    public void run() {
        long counter = 0L;
        while (Boolean) {
            counter++;
        }
        System.out.println("Loop is finished. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileModel thread = new VolatileModel();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        thread.Boolean = false;
        thread.join();
        System.out.println("End of program");
    }
}
