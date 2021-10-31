package org.multithreading.service.model.locksClasses;

import org.multithreading.service.model.locks.LockUtil;
import org.multithreading.service.model.locksClasses.model.Converter;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/**
 * @author maksymkhodakov
 * @param <T>
 * @apiNote This app shows threads controlling using modern Java
 */

public class Daemons<T> implements Converter<String, Integer> {
    private static final Logger logger = Logger.getLogger(Daemons.class.getName());

    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Name of thread: " + Thread.currentThread().getName());
        task.run();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Done!");

        Runnable coolTask = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Foo " + name);
            LockUtil.sleep(1L);
            System.out.println("Boo " + name);
        };
        Thread thread2 = new Thread(coolTask);
        thread2.start();

        Daemons<String> daemons = new Daemons<>();
        String testString = Thread.currentThread().toString();
        logger.info(String.valueOf(daemons.convert(testString)));
        logger.info(String.valueOf(daemons.callable("Thread is good for Java", 5)));
    }

    Callable<T> callable (T result, long sleepSeconds) {
        return () -> {
            LockUtil.sleep(sleepSeconds);
          return result;
        };
    }

    @Override
    public Integer convert(String from) {
        AtomicReference<Integer> result = new AtomicReference<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            Converter<String, Integer> converter = String::length;
            result.set(converter.convert(Thread.currentThread().getName()));
        });
        LockUtil.stopExecutor(executorService);
        return result.get();
    }
}
