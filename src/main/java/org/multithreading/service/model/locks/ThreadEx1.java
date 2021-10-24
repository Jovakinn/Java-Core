package org.multithreading.service.model.locks;

public class ThreadEx1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + ": try to occupy monitor of object lock1");
        synchronized (DeadLock.lock1){
            System.out.println(Thread.currentThread() + ": monitor of object lock1 was captured");
            System.out.println(Thread.currentThread() + ": try to occupy monitor of object lock2");
            synchronized (DeadLock.lock2) {
                System.out.println(Thread.currentThread() + ": monitors of objects lock1" +
                        " lock2 was captured");
            }
        }
    }
}
