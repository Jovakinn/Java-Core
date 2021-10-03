package org.collection.service;

import org.collection.model.Sex;
import org.collection.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class IteratorExample {
    private static final Logger logger = Logger.getLogger(IteratorExample.class.getName());
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student2 = new Student("Ivan", Sex.MALE, 121, 4, 6011.0);
        Student student3 = new Student("Susan", Sex.FEMALE, 18, 2, 210.0);
        Student student4 = new Student("Den", Sex.MALE, 11, 0, 00.0);
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
