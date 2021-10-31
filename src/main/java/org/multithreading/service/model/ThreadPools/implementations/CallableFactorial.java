package org.multithreading.service.model.ThreadPools.implementations;

import org.multithreading.service.model.ThreadPools.FactorialOfCallable;
import org.multithreading.service.model.locks.LockUtil;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class CallableFactorial {
    private static final Logger log = Logger.getLogger(CallableFactorial.class.getName());
    static Integer factorialResult;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FactorialOfCallable factorialOfCallable = new FactorialOfCallable(5);

        Future<Integer> future = executor.submit(factorialOfCallable);
        try {
            factorialResult = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        LockUtil.stopExecutor(executor);
        log.info(String.valueOf(factorialResult));
    }
}
