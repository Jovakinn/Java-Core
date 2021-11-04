package org.IO.Serealization.models;

import java.io.Serializable;
import java.util.Objects;

public class Employees implements Serializable {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;
    private Car car;

    public Employees(String firstName, String lastName, Integer age, Double salary, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    public Employees() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        Employees employees = (Employees) o;
        return Objects.equals(getFirstName(), employees.getFirstName()) && Objects.equals(getLastName(), employees.getLastName()) && Objects.equals(getAge(), employees.getAge()) && Objects.equals(getSalary(), employees.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getSalary());
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
