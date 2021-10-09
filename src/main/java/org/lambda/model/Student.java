package org.lambda.model;

import java.util.Objects;

public class Student {
    private String name;
    private Sex sex;
    private Integer age;
    private Integer course;
    private Double avgGrade;

    public Student(String name, Sex sex, Integer age, Integer course, Double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && getSex() == student.getSex() && Objects.equals(getAge(), student.getAge()) && Objects.equals(getCourse(), student.getCourse()) && Objects.equals(getAvgGrade(), student.getAvgGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), getAge(), getCourse(), getAvgGrade());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(Double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
