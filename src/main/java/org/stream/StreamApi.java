package org.stream;

import org.lambda.model.Sex;
import org.stream.model.Car;
import org.stream.model.CarCompanies.Companies;
import org.stream.model.Person;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class StreamApi {
    private static final Logger LOG = Logger.getLogger(StreamApi.class.getName());

    public static void main(String[] args) {
        List<Person> personArrayList = Arrays.asList(
                new Person("Max", "Khodakov", 17, Sex.MALE, "Kyiv"),
                new Person("Alex", "Cherechecha", 28, Sex.QUIR, "Lviv"),
                new Person("Jake", "Jacksovich", 29, Sex.FEMALE, "Kharkiv")
        );

        List<Car> carList = Arrays.asList(
                new Car("AA2322VV", 1999, Companies.Toyota),
                new Car("AA2823VV", 2010, Companies.BMW),
                new Car("AA2352VK", 2021, Companies.Mercedes)
        );

        Person result = personArrayList.stream()
                .filter(person -> person.getAge().equals(29) && person.getFirstName().equals("Jake"))
                .findAny()
                .orElse(null);
        LOG.info(String.valueOf(result));

        carList.stream()
                .filter(car -> car.getYear() > 1999)
                .map(Car::getNumber)
                .filter(number -> number != null && !number.isEmpty())
                .forEach(LOG::info);
    }
}
