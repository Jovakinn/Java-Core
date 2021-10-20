package org.multithreading.service.model;

public class Counter implements Runnable {
    public static Integer count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            DataRace.increment();
        }
    }
}
