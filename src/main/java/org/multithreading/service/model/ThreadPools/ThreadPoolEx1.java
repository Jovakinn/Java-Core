package org.multithreading.service.model.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class ThreadPoolEx1 {

    private static final Logger log = Logger.getLogger(ThreadPoolEx1.class.getName());

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl());
        }
        executorService.shutdown();
        log.info("Main thead is finished");
    }
}
