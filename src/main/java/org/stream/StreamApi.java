package org.stream;

import org.lambda.model.Sex;
import org.stream.model.Car;
import org.stream.model.CarCompanies.Companies;
import org.stream.model.Connection;
import org.stream.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
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

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Integer sum = numbers.stream()
                .reduce(10, Integer::sum);
        LOG.info(String.valueOf(sum));

        List<String> stringList = Arrays.asList("Hello","Good", "Welcome");
        String largestStringInList = stringList.stream()
                .reduce("", (left, right) -> left.length() > right.length() ? left : right);
        LOG.info(largestStringInList);

        List<Connection> network = Arrays.asList(
                new Connection("A", "B"),
                new Connection("A", "C"),
                new Connection("A", "D"),
                new Connection("B", "C")
        );

        List<String> identity = new ArrayList<>();

        BiFunction<List<String>, Connection, List<String>> accumulator = ((strings, connection) -> {
           strings.add(connection.getTo());
           return strings;
        });

        BinaryOperator<List<String>> combiner = ((strings, strings2) -> {
            strings.addAll(strings2);
            return strings;
        });

        List<String> listOfConnections = network.stream()
                .filter(connection -> "A".equals(connection.getFrom()))
                .reduce(identity, accumulator, combiner);
        LOG.info(String.valueOf(listOfConnections));
    }
}
