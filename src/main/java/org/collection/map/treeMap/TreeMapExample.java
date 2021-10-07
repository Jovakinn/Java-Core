package org.collection.map.treeMap;


import org.collection.model.Sex;
import org.collection.model.Student;

import java.util.TreeMap;
import java.util.logging.Logger;

public class TreeMapExample {
    private static final Logger logger = Logger.getLogger(TreeMapExample.class.getName());

    public static void main(String[] args) {
        TreeMap<Double, Student> studentTreeMap = new TreeMap<>();
        Student studentMax = new Student("Max", Sex.MALE, 17, 1, 634.0);
        Student studentAlex = new Student("Alex", Sex.MALE, 19, 3, 876.0);
        Student studentDima = new Student("Dima", Sex.MALE, 20, 4, 8134.0);
        Student studentVova = new Student("Vova", Sex.MALE, 17, 1, 612.0);
        Student studentAlice = new Student("Alice", Sex.FEMALE, 25, 3, 821.0);
        Student studentJake = new Student("Jake", Sex.MALE, 24, 4, 82334.0);
        Student studentFake = new Student("Jake", Sex.MALE, 24, 4, 82334.0);

        studentTreeMap.put(studentMax.getAverageScore(), studentMax);
        studentTreeMap.put(studentAlex.getAverageScore(), studentAlex);
        studentTreeMap.put(studentDima.getAverageScore(), studentDima);
        studentTreeMap.put(studentVova.getAverageScore(), studentVova);
        studentTreeMap.put(studentAlice.getAverageScore(), studentAlice);
        studentTreeMap.put(studentJake.getAverageScore(), studentJake);
        studentTreeMap.put(studentFake.getAverageScore(), studentFake);

        logger.info(String.valueOf(studentTreeMap));
        studentTreeMap.remove(studentFake.getAverageScore());
        logger.info(String.valueOf(studentTreeMap.descendingMap()));
    }
}
