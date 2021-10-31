package org.multithreading.service.model.ThreadPools;

import org.multithreading.service.model.ThreadPools.implementations.RunnableFactorial;

import java.util.Objects;
import java.util.logging.Logger;

public class Factorial implements Runnable {
    private static final Logger log = Logger.getLogger(Factorial.class.getName());

    private Integer factorialNumber;

    public Factorial(Integer factorialNumber) {
        this.factorialNumber = factorialNumber;
    }

    public Factorial() {
    }

    public Integer getFactorialNumber() {
        return factorialNumber;
    }

    public void setFactorialNumber(Integer factorialNumber) {
        this.factorialNumber = factorialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factorial)) return false;
        Factorial factorial = (Factorial) o;
        return Objects.equals(getFactorialNumber(), factorial.getFactorialNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFactorialNumber());
    }

    @Override
    public String toString() {
        return "Factorial{" +
                "factorialNumber=" + factorialNumber +
                '}';
    }

    @Override
    public void run() {
        if (factorialNumber <= 0) {
            log.severe("Less than zero");
            return;
        }
        int result = 1;
        for (int i = 1; i <= factorialNumber; i++) {
            result *= i;
        }
        RunnableFactorial.factorialResult = result;
    }
}
