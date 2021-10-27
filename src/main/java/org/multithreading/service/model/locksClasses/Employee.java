package org.multithreading.service.model.locksClasses;

import java.util.concurrent.locks.Lock;

public class Employee extends Thread {
    private String firstName;
    private String lastName;
    private Lock lock;

    public Employee(String firstName, String lastName, Lock lock){
        this.firstName = firstName;
        this.lastName = lastName;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(firstName + " " + lastName + " is waiting...");
                lock.lock();
                System.out.println(firstName + " " + lastName + " is using ATM.");
                Thread.sleep(2000);
                System.out.println(firstName + " " + lastName + " has done all errands!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(firstName + " " + lastName + " can't wait in a queue.");
        }
    }
}
