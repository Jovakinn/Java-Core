package org.collection.com;

import org.collection.com.model.Sex;
import org.collection.com.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AppCollection {
    private static final Logger logger = Logger.getLogger(AppCollection.class.getName());
    public static void main(String[] args) {
        Student student1 = new Student("Max", Sex.MALE, 17, 1, 603321.0);
        Student student2 = new Student("Ivan", Sex.MALE, 121, 4, 6011.0);
        Student student3 = new Student("Susan", Sex.FEMALE, 18, 2, 210.0);
        Student student4 = new Student("Den", Sex.MALE, 11, 0, 00.0);
        Student studentQ = new Student("Max", Sex.MALE, 12, 1, 603321.0);
        Student studentW = new Student("Ivan", Sex.MALE, 1321, 4, 6011.0);
        Student studentE = new Student("Susan", Sex.FEMALE, 18121, 3, 210.0);
        Student studentR = new Student("Den", Sex.MALE, 11, 5, 00.0);

        ArrayList<Student> arrayList = new ArrayList<>();
        ArrayList<Student> arrayList2 = new ArrayList<>();

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.remove(student2);

        arrayList2.add(studentQ);
        arrayList2.add(studentW);
        arrayList2.add(studentE);
        arrayList2.add(studentR);
        arrayList.addAll(arrayList2);

        List<Student> myList1 = arrayList.subList(2, 4);
        logger.info(String.valueOf(myList1));

        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }
}
