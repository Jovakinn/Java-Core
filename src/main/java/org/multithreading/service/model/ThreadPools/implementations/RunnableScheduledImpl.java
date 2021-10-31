package org.multithreading.service.model.ThreadPools.implementations;

import org.multithreading.service.model.locks.LockUtil;
import java.util.logging.Logger;

public class RunnableScheduledImpl implements Runnable {

    private static final Logger log = Logger.getLogger(RunnableScheduledImpl.class.getName());
    public static final Long SECONDS_TO_SLEEP = 20L;

    @Override
    public void run() {
        log.info("Thread name: " + Thread.currentThread().getName() +
                " Thread status: " + Thread.currentThread().getState() +
                " Thread daemon: " + Thread.currentThread().isDaemon());
        LockUtil.sleep(1L);
        log.info("Thread is finished");
    }
}
