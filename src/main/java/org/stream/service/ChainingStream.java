package org.stream.service;

import java.util.Arrays;

public class ChainingStream {
    public static void main(String[] args) {
        int[] array = {3, 6, 79, 345, 6, 9, 654, 122};
        int result = Arrays.stream(array)
                .filter(element -> element % 2 != 0)
                .map(element -> {
                    if (element % 3 == 0)
                        element /= 3;
                    return element;
                })
                .reduce(Integer::sum)
                .getAsInt();
        System.out.println(result);
    }
}
