package org.multithreading.service.model.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
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

    public static void sleep(Long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
