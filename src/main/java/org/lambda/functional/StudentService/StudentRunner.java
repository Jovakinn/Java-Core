package org.lambda.functional.StudentService;

import org.lambda.model.Sex;
import org.lambda.model.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import static org.lambda.functional.StudentService.StudentService.avgOfStudent;
import static org.lambda.functional.StudentService.StudentService.testStudents;

public class StudentRunner {

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

        students.sort(Comparator.comparingInt(Student::getCourse));
        System.out.println(students);

        Predicate<Student> predicateOfAge = student -> student.getAge() < 30;
        Predicate<Student> predicateOfCourseAndAge = student -> student.getCourse() > 1 &&
                student.getAge() > 17;
        testStudents(students, predicateOfAge);
        testStudents(students, predicateOfCourseAndAge);
        testStudents(students, predicateOfAge.and(predicateOfCourseAndAge));
        testStudents(students, predicateOfAge.or(predicateOfCourseAndAge));
        testStudents(students, predicateOfAge.negate());

        Double result = avgOfStudent(students, student -> student.getCourse().doubleValue());
        System.out.println(result);

        students.stream()
                .filter(student -> student.getSex().equals(Sex.QUIR))
                .forEach(System.out::println);

        Predicate<Student> predicate = student -> student.getSex().equals(Sex.QUIR);
        students.removeIf(predicate);
        System.out.println(students);
    }
}
