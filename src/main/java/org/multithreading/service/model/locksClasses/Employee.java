package org.multithreading.service.model.locksClasses;

import java.util.Objects;
import java.util.concurrent.locks.Lock;

public class Employee extends Thread {
    private String firstName;
    private String lastName;
    private Lock lock;

    public Employee(String firstName, String lastName, Lock lock){
        this.firstName = firstName;
        this.lastName = lastName;
        this.lock = lock;
        this.start();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lock=" + lock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getLock(), employee.getLock());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getLock());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(firstName + " " + lastName + " is waiting...");
                lock.lock();
                System.out.println(firstName + " " + lastName + " is using ATM.");
                Thread.sleep(2000);
                System.out.println(firstName + " " + lastName + " has done all errands!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(firstName + " " + lastName + " can't wait in a queue.");
        }
    }
}
