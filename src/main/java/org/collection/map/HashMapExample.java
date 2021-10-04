package org.collection.map;

import org.collection.model.Sex;
import org.collection.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class HashMapExample {
    private static final Logger logger = Logger.getLogger(HashMapExample.class.getName());

    public static void main(String[] args) {
        Map<Student, Double> averageStudentGradeValueMap = new HashMap<>();
        Student studentMax = new Student("Max", Sex.MALE, 17, 1, 60.0);
        Student studentAlex = new Student("Alex", Sex.MALE, 19, 3, 80.0);
        Student studentDima = new Student("Dima", Sex.MALE, 20, 4, 80.0);

        averageStudentGradeValueMap.put(studentMax, studentMax.getAverageScore());
        averageStudentGradeValueMap.put(studentAlex, studentAlex.getAverageScore());
        averageStudentGradeValueMap.put(studentDima, studentDima.getAverageScore());
        logger.info(String.valueOf(averageStudentGradeValueMap));

        for (Map.Entry<Student, Double> entry: averageStudentGradeValueMap.entrySet()) {
            logger.info(entry.getKey() + ":" + entry.getValue());
        }
    }
}
