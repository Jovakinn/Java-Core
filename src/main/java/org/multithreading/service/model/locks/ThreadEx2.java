package org.multithreading.service.model.locks;


/**
 * @author maksymkhodakov
 * @apiNote Be sure to check the lock sequence. If in @ThreadEx1 and @ThreadEx2 lock are
 * in different sequence, there will be a deadlock situation. To avoid this be sure to check
 * the sequence of locks.
 */
public class ThreadEx2 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + ": try to occupy monitor of object lock1");
        synchronized (DeadLock.lock2){
            System.out.println(Thread.currentThread() + ": monitor of object lock2 was captured");
            System.out.println(Thread.currentThread() + ": try to occupy monitor of object lock1");
            synchronized (DeadLock.lock1) {
                System.out.println(Thread.currentThread() + ": monitors of objects lock1" +
                        " lock2 was captured");
            }
        }
    }
}
