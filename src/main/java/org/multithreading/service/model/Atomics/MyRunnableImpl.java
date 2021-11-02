package org.multithreading.service.model.Atomics;

public class MyRunnableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx.increment();
        }
    }
}
