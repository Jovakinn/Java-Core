package org.stream.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Person> studentsOfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOfFaculty = new ArrayList<>();
    }

    public List<Person> getStudentsOfFaculty() {
        return studentsOfFaculty;
    }

    public void addPersonToFaculty(Person person){
        studentsOfFaculty.add(person);
    }
}
