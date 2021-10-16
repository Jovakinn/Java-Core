package org.multithreading;

import org.multithreading.service.threads.MyThread3;
import org.multithreading.service.threads.MyThread4;

public class MultithreadingRunner {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        thread1.start();
        thread2.start();
    }
}
