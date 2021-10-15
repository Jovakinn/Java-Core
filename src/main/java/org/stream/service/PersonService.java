package org.stream.service;

import org.lambda.model.Sex;
import org.stream.model.Faculty;
import org.stream.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public static void main(String[] args) {
        Person person1 = new Person("Andrew", "Chmerkovskyi", 22, Sex.MALE, "Kharkiv");
        Person person2 = new Person("Alex", "Cherechecha", 28, Sex.QUIR, "Lviv");
        Person person3 = new Person("Kate", "Cherechecha", 30, Sex.QUIR, "Lviv");
        Person person4 = new Person("Jake", "Jacksovich", 29, Sex.FEMALE, "Kharkiv");
        Person person5 = new Person("Max", "Khodakov", 17, Sex.MALE, "Kyiv");

        Faculty facultyOfEconomics = new Faculty("Economics");
        Faculty facultyOfCybernetics = new Faculty("Cybernetics");

        facultyOfEconomics.addPersonToFaculty(person1);
        facultyOfEconomics.addPersonToFaculty(person2);
        facultyOfEconomics.addPersonToFaculty(person3);
        facultyOfCybernetics.addPersonToFaculty(person4);
        facultyOfCybernetics.addPersonToFaculty(person5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(facultyOfEconomics);
        facultyList.add(facultyOfCybernetics);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOfFaculty().stream())
                .forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
    }
}
