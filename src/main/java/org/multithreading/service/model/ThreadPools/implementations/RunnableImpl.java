package org.multithreading.service.model.ThreadPools.implementations;

import org.multithreading.service.model.locks.LockUtil;

import java.util.logging.Logger;

public class RunnableImpl implements Runnable {

    private static final Logger log = Logger.getLogger(RunnableImpl.class.getName());

    @Override
    public void run() {
        log.info("Thread name: " + Thread.currentThread().getName() +
                " Thread status: " + Thread.currentThread().getState() +
                " Thread daemon: " + Thread.currentThread().isDaemon());
        LockUtil.sleep(5L);
        log.info("Thread is finished");
    }
}
