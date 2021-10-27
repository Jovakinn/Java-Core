package org.multithreading.service.model.locksClasses;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Call {
    static final Lock lock = new ReentrantLock();

    public void mobileCall() {
        lock.lock();
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println("Call ends");
    }

    public void telegramCall() {
        lock.lock();
            System.out.println("Telegram call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println("Call ends");

    }

    public void viberCall() {
        lock.lock();
            System.out.println("Viber call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println("Call ends");
    }
}
