package org.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("adscs32324");
        arrayList.add("ads123123");
        arrayList.add("ads124c");
        arrayList.add("adscw1341");
        arrayList.add("adscs231231");
        arrayList.add("adscsc");

        arrayList.stream()
                .map(String::length)
                .forEach(System.out::println);

        int[] array = {5, 3, 6, 9, 4};
        Arrays.stream(array)
                .map(element -> {
                    if (element % 3 == 0)
                        element = element / 3;
                    return element;
                })
                .forEach(System.out::println);


        Set<String> setOfStrings = new TreeSet<>();
        setOfStrings.add("Hello java boy");
        setOfStrings.add("How are you?");
        setOfStrings.add("Hello partner");
        setOfStrings.add("Hello");

        Set<Integer> set = setOfStrings.stream()
                .map(String::length).collect(Collectors.toSet());
        System.out.println(set);
    }
}
