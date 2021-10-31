package org.multithreading.service.model.ThreadPools.implementations;

import org.multithreading.service.model.ThreadPools.Factorial;
import org.multithreading.service.model.locks.LockUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class RunnableFactorial {
    private static final Logger log = Logger.getLogger(RunnableFactorial.class.getName());
    public static Integer factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        executorService.execute(factorial);
        LockUtil.stopExecutor(executorService);
        log.info(String.valueOf(factorialResult));
    }
}
