package org.stream.service;

import java.util.ArrayList;
import java.util.List;

/**
 @author Jovakinn
  * This functional shows that parallel streams are usefunl only with associative operation.
  * Division is an example of non-associative operation, therefore it shouldn't be used with
  * parallel streams.
 */

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        Double sumResult = list.stream()
                .reduce((Double::sum))
                .get();
        System.out.println("Sum result: " + sumResult);

        Double divisionResult = list.stream()
                .reduce(((aDouble, aDouble2) -> aDouble / aDouble2))
                .get();
        System.out.println("Division result: " + divisionResult);

       // wrong functional
        Double divisionWrongResult = list.parallelStream()
                .reduce(((aDouble, aDouble2) -> aDouble / aDouble2))
                .get();
        System.out.println("Wrong division result: " + divisionWrongResult);
    }
}
