package org.multithreading.service.model.ThreadPools;

import org.multithreading.service.model.ThreadPools.implementations.PartialSum;
import org.multithreading.service.model.locks.LockUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class SumNumbers {
    private static final Logger logger = Logger.getLogger(SumNumbers.class.getName());
    private static final Long value = 1_000_000_000L;
    private static Long sum = 0L;
    private static final int divisionValueNumber = 10;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futures = new ArrayList<>();
        long valueDividedBy10 = value / divisionValueNumber;
        for (int i = 0; i < divisionValueNumber; i++) {
            Long from = valueDividedBy10 * i + 1;
            Long to = valueDividedBy10 * (i + 1);

            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartialSum = executorService.submit(task);
            futures.add(futurePartialSum);
        }
        for (Future<Long> result : futures) {
            sum += result.get();
        }
        LockUtil.stopExecutor(executorService);
        logger.info("Total sum = " + sum);
    }
}
