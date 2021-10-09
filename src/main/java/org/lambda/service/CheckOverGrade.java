package org.lambda.service;

import org.lambda.model.Student;

public class CheckOverGrade implements StudentChecks {
    @Override
    public Boolean check(Student student) {
        return student.getAvgGrade() > 5000;
    }
}
