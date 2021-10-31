package org.multithreading.service.model.ThreadPools;

import org.multithreading.service.model.locks.LockUtil;

import java.util.Objects;
import java.util.concurrent.Callable;

public class FactorialOfCallable implements Callable<Integer> {
    private Integer f;

    public FactorialOfCallable(Integer f) {
        this.f = f;
    }

    public FactorialOfCallable() {
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FactorialOfCallable)) return false;
        FactorialOfCallable that = (FactorialOfCallable) o;
        return Objects.equals(getF(), that.getF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getF());
    }

    @Override
    public String toString() {
        return "FactorialOfCallable{" +
                "f=" + f +
                '}';
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Not defined");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            LockUtil.sleep(1L);
        }
        return result;
    }
}
