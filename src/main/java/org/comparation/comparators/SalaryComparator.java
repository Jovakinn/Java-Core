package org.comparation.comparators;

import org.comparation.com.model.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
