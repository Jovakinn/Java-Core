package org.multithreading.service.model.ThreadPools;

import org.multithreading.service.model.ThreadPools.implementations.RunnableScheduledImpl;
import org.multithreading.service.model.locks.LockUtil;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadScheduledPool {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor =
                new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new RunnableScheduledImpl(), 3, 1L, TimeUnit.SECONDS);
        LockUtil.sleep(RunnableScheduledImpl.SECONDS_TO_SLEEP);
        LockUtil.stopExecutor(scheduledThreadPoolExecutor);
    }
}
