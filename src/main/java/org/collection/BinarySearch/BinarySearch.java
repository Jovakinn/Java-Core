package org.collection.BinarySearch;

import org.collection.linked.linkedmodel.Employee;
import org.collection.model.Sex;

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Employee e1 = new Employee(321, "Max",  "Khodakov", 21, Sex.MALE, 192.33);
        Employee e2 = new Employee(212, "Mark", "Borodai",  32, Sex.FEMALE, 6423.21);
        Employee e3 = new Employee(121, "Gena", "Yagodka",  18, Sex.MALE, 186.33);
        Employee e4 = new Employee(456, "Jake", "Cringe",   21, Sex.MALE, 192.33);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println("\n" + employeeList);


        int[] array = {3, 4, 7, 5, 8, 86, 121};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 121);
        System.out.println(index);

        Collections.shuffle(employeeList);
        System.out.println(employeeList);
    }
}
