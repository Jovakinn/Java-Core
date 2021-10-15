package org.stream;


import org.lambda.model.Sex;
import org.stream.model.Person;
import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Person> personArrayList = Arrays.asList(
                new Person("Max", "Khodakov", 17, Sex.MALE, "Kyiv"),
                new Person("Alex", "Cherechecha", 28, Sex.QUIR, "Lviv"),
                new Person("Jake", "Jacksovich", 29, Sex.FEMALE, "Kharkiv")
        );

        Person result = personArrayList.stream()
                .filter(person -> person.getAge().equals(29) && person.getFirstName().equals("Jake"))
                .findAny()
                .orElse(null);
        System.out.println(result);
    }
}
