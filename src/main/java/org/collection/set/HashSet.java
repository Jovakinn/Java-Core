package org.collection.set;

import org.collection.model.Sex;
import org.collection.model.Student;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class HashSet {
    private final static Logger logger = Logger.getLogger(HashSet.class.getName());
    public static void main(String[] args) {
        Student studentMax = new Student("Max", Sex.MALE, 17, 1, 634.0);
        Student studentAlex = new Student("Alex", Sex.MALE, 19, 3, 876.0);
        Student studentDima = new Student("Dima", Sex.MALE, 20, 4, 8134.0);
        Student studentVova = new Student("Vova", Sex.MALE, 17, 1, 612.0);
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(studentMax);
        treeSet.add(studentAlex);
        treeSet.add(studentDima);
        treeSet.add(studentVova);

        logger.info(String.valueOf(treeSet));
        logger.info(String.valueOf(treeSet.first()));
        logger.info(String.valueOf(treeSet.last()));
        logger.info(String.valueOf(treeSet.headSet(studentAlex)));
        logger.info(String.valueOf(treeSet.tailSet(studentAlex)));
    }
}
