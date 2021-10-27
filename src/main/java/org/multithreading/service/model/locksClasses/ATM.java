package org.multithreading.service.model.locksClasses;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Max", "Khodakov", lock);
        new Employee("Artem", "Barysh", lock);
        new Employee("Nastya", "Borodai", lock);
        new Employee("Jack", "Of All Trades", lock);
    }
}
