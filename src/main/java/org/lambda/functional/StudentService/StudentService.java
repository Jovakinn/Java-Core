package org.lambda.functional.StudentService;

import org.lambda.model.Student;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class StudentService {
    private static final Logger LOGGER_ = Logger.getLogger(StudentService.class.getName());

    public static void testStudents(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student student : arrayList) {
            if (predicate.test(student))
                LOGGER_.info(String.valueOf(student));
        }
    }

    public static Double avgOfStudent(ArrayList<Student> arrayList, Function<Student, Double> function) {
        Double result = 0.0;
        for (Student student: arrayList) {
            result += function.apply(student);
        }
        result /= arrayList.size();
        return result;
    }
}
