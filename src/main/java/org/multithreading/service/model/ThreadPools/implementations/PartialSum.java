package org.multithreading.service.model.ThreadPools.implementations;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

public class PartialSum implements Callable<Long> {
    private static final Logger log = Logger.getLogger(PartialSum.class.getName());

    private Long from;
    private Long to;
    private Long localSum = 0L;

    public PartialSum(Long from, Long to) {
        this.from = from;
        this.to = to;
    }

    public PartialSum() {
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public Long getLocalSum() {
        return localSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PartialSum that)) return false;
        return Objects.equals(getFrom(), that.getFrom()) && Objects.equals(getTo(), that.getTo()) && Objects.equals(getLocalSum(), that.getLocalSum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrom(), getTo(), getLocalSum());
    }

    @Override
    public String toString() {
        return "PartialSum{" +
                "from=" + from +
                ", to=" + to +
                ", localSum=" + localSum +
                '}';
    }

    @Override
    public Long call() throws Exception {
        for (Long i = from; i <= to; i++) {
            localSum += i;
        }
        log.info("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}
