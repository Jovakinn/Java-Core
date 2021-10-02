package org.collection.com.model;

public class Student {
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
}
