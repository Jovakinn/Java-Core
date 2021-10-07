package org.collection.map.LinkedHashMap;

import org.collection.model.Sex;
import org.collection.model.Student;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMApExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student studentMax = new Student("Max", Sex.MALE, 17, 1, 634.0);
        Student studentAlex = new Student("Alex", Sex.MALE, 19, 3, 876.0);
        Student studentDima = new Student("Dima", Sex.MALE, 20, 4, 8134.0);
        Student studentVova = new Student("Vova", Sex.MALE, 17, 1, 612.0);

        linkedHashMap.put(studentMax.getAverageScore(), studentMax);
        linkedHashMap.put(studentAlex.getAverageScore(), studentAlex);
        linkedHashMap.put(studentDima.getAverageScore(), studentDima);
        linkedHashMap.put(studentVova.getAverageScore(), studentVova);

        System.out.println(linkedHashMap);
    }
}
