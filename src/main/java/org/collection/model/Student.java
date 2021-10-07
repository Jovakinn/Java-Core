package org.collection.model;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private Sex sex;
    private Integer age;
    private Integer yearOfStudy;
    private Double averageScore;

    public Student(String name, Sex sex, Integer age, Integer yearOfStudy, Double averageScore) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.yearOfStudy = yearOfStudy;
        this.averageScore = averageScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && getSex() == student.getSex() && Objects.equals(getAge(), student.getAge()) && Objects.equals(getYearOfStudy(), student.getYearOfStudy()) && Objects.equals(getAverageScore(), student.getAverageScore());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), getAge(), getYearOfStudy(), getAverageScore());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", yearOfStudy=" + yearOfStudy +
                ", averageScore=" + averageScore +
                '}';
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

    public Integer getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return (int) (this.getAverageScore() - o.getAverageScore());
    }
}
