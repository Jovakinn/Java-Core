package org.multithreading.service.model.locks;

public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        ThreadEx1 threadEx1 = new ThreadEx1();
        ThreadEx2 threadEx2 = new ThreadEx2();
        threadEx1.start();
        threadEx2.start();
    }
}
