package org.multithreading.service.model.locksClasses;

import org.multithreading.service.model.locksClasses.model.Converter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public class Daemons implements Converter<String, Integer> {
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
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Boo " + name);
        };
        Thread thread2 = new Thread(coolTask);
        thread2.start();


        Daemons daemons = new Daemons();
        String testString = Thread.currentThread().toString();
        logger.info(String.valueOf(daemons.convert(testString)));
    }

    @Override
    public Integer convert(String from) {
        AtomicReference<Integer> result = new AtomicReference<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            Converter<String, Integer> converter = String::length;
            result.set(converter.convert(Thread.currentThread().getName()));
        });
        try {
            System.out.println("attempt to shutdown executor");
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        }
        finally {
            if (!executorService.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executorService.shutdownNow();
            System.out.println("shutdown finished");
        }
        return result.get();
    }
}
