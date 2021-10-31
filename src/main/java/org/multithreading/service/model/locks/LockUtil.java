package org.multithreading.service.model.locks;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Logger;

public class LockUtil {
    private static final Logger logger = Logger.getLogger(LockUtil.class.getName());

    public static void stopExecutor(ExecutorService executorService) {
        try {
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            logger.info("Termination interrupted");
        } finally {
            if (!executorService.isTerminated()){
                logger.warning("killing non-finished task");
            }
            executorService.shutdownNow();
        }
    }

    public static void completeTask(AtomicLong initialAtomicLongValue) {
        Runnable task = () -> initialAtomicLongValue.set(new Date().getTime());
        Function<Long, Date> dateConverter = Date::new;
        Consumer<Date> printer = date -> logger.info(String.valueOf(date));
        CompletableFuture.runAsync(task)
                .thenApply((v) -> initialAtomicLongValue.get())
                .thenApply(dateConverter)
                .thenAccept(printer);
    }

    public static void sleep(Long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AtomicLong longValue = new AtomicLong(1);
        completeTask(longValue);
    }
}
