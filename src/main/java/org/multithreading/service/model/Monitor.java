package org.multithreading.service.model;

import org.multithreading.service.threadsToUse.MyRunnableEx;

public class Monitor implements Runnable{
    @Override
    public void run() {
        MyRunnableEx.doWork();
    }

    public static void main(String[] args) {
        MyRunnableEx runnableEx = new MyRunnableEx();
        Thread thread1 = new Thread(runnableEx);
        Thread thread2 = new Thread(runnableEx);
        Thread thread3 = new Thread(runnableEx);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
