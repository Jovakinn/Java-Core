package org.multithreading.service.model.synchronizers;

import org.multithreading.service.model.locks.LockUtil;

import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class Person extends Thread {
    private static final Logger logger = Logger.getLogger(Person.class.getName());
    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getCallBox(), person.getCallBox());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCallBox());
    }

    public Semaphore getCallBox() {
        return callBox;
    }

    public void setCallBox(Semaphore callBox) {
        this.callBox = callBox;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", callBox=" + callBox +
                '}';
    }

    @Override
    public void run() {
        try {
            logger.info(name + " is waiting...");
            callBox.acquire();
            logger.info(name + " using phone");
            LockUtil.sleep(2L);
            logger.info(name + " is done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}