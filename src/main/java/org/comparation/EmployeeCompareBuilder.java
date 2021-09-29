package org.comparation;

import org.comparation.com.model.Employee;
import org.comparation.comparators.IdComparator;
import org.comparation.comparators.SalaryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCompareBuilder {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(100, "Max", "Khodakov", 17, 80000.0);
        Employee employee2 = new Employee(2, "Jack", "Marston", 18, 40000.0);
        Employee employee3 = new Employee(30, "Arthur", "Morgan", 36, 50000.0);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        System.out.println("Before sorting: \n" + list);
        Collections.sort(list, new IdComparator());
        System.out.println(list);
        Collections.sort(list, new SalaryComparator());
        System.out.println(list);
    }
}
