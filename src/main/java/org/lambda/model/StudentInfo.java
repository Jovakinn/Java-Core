package org.lambda.model;

import org.lambda.model.service.CheckOverGrade;
import org.lambda.model.service.StudentChecks;
import java.util.ArrayList;
import java.util.logging.Logger;

public class StudentInfo {
    private static final Logger logger = Logger.getLogger(StudentInfo.class.getName());

    void printStudentsOverGrade(ArrayList<Student> arrayList, StudentChecks studentChecks) {

        for (Student student : arrayList) {
            if (studentChecks.check(student))
                System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Max", Sex.MALE, 17, 1, 7000.0);
        Student student2 = new Student("Alex", Sex.MALE, 312427, 2, 5000.0);
        Student student3 = new Student("Gabriel", Sex.MALE, 17, 4, 2000.0);
        Student student4 = new Student("Sasha", Sex.FEMALE, 124, 5, 5000.0);
        Student student5 = new Student("Max", Sex.QUIR, 46, 3, 5600.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentInfo info = new StudentInfo();
        info.printStudentsOverGrade(students, new CheckOverGrade());
        info.printStudentsOverGrade(students, new StudentChecks() {
            @Override
            public Boolean check(Student student) {
                return student.getAge() < 30;
            }
        });
        info.printStudentsOverGrade(students, student -> student.getCourse() > 1 && student.getAge() > 17);
    }
}
