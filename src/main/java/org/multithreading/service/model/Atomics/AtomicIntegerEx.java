package org.multithreading.service.model.Atomics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    static AtomicInteger counter = new AtomicInteger(0);

    public synchronized static void increment() {
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> list = Collections.synchronizedList(new ArrayList<>());
        Thread thread1 = new Thread(new MyRunnableImpl());
        Thread thread2 = new Thread(new MyRunnableImpl());
        list.add(thread1);
        list.add(thread2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        list.stream().findFirst().toString().equals("thread");

        System.out.println(counter);
    }
}
