package org.generics.game;

public abstract class Participant {
    private String name;
    private Integer age;

    public Participant(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Participant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
