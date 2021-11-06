package org.reflection.model;

import org.reflection.Departments.Department;
import java.util.Objects;

@CompanyRelated(CompanyName = "EPAM", yearOfCompanyCreation = 1993)
public class Employee {
    private Integer id;
    private String name;
    private Department department;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee(Integer id, String name, Department department, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && department == employee.department && Objects.equals(getSalary(), employee.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, getSalary());
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @CompanyRelated
    private void changeDepartment(Department newDepartment) {
        department = newDepartment;
        System.out.println("New department is: " + department);
    }

    @CompanyRelated
    private void increaseSalary(Employee employee, Double sumToIncrease) {
        employee.setSalary(employee.getSalary() + sumToIncrease);
    }

    @CompanyRelated
    private void decreaseSalary(Employee employee, Double sumToDecrease) {
        employee.setSalary(employee.getSalary() - sumToDecrease);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
