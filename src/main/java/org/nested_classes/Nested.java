package org.nested_classes;

import java.util.Objects;

public class Nested {
    private String type;
    private Integer age;

    public Nested(String type, Integer age) {
        this.type = type;
        this.age = age;
    }

    public Nested() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nested)) return false;
        Nested nested = (Nested) o;
        return Objects.equals(getType(), nested.getType()) && Objects.equals(getAge(), nested.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getAge());
    }

    @Override
    public String toString() {
        return "Nested{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    void method() {
        System.out.println(SuperInner.countOfObjects);
    }

    public record SuperInner(Integer differentialPower) {

        public static Integer countOfObjects = 0;
        public SuperInner {
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "SuperInner{" +
                    "differentialPower=" + differentialPower +
                    '}';
        }
    }
}
