package org.collection.com.service;

import org.collection.com.model.SexOfStudent;
import org.collection.com.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class IteratorExample {
    private static final Logger logger = Logger.getLogger(IteratorExample.class.getName());
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student2 = new Student("Ivan", SexOfStudent.MALE, 121, 4, 6011.0);
        Student student3 = new Student("Susan", SexOfStudent.FEMALE, 18, 2, 210.0);
        Student student4 = new Student("Den", SexOfStudent.MALE, 11, 0, 00.0);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        Iterator<Student> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            logger.info(String.valueOf(iterator.next()));
        }
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        logger.info(String.valueOf(arrayList));
    }
}