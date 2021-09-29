package org.generics;

import org.generics.service.classes.Pair;
import org.generics.utilites.ParametrizedMethods;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        Pair<String, Integer> pairOfElementsWithStringANdIntegers = new Pair<>("max", 4000);
        Pair<Integer, String> pairOfElementsWthIntegerAndStrings = new Pair<>(3000, "alex");

        System.out.println(pairOfElementsWthIntegerAndStrings.getValue1());
        System.out.println(pairOfElementsWithStringANdIntegers.getValue2());

        // check parametrized methods

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("H");
        arrayList.add("E");
        arrayList.add("L");
        arrayList.add("L");
        arrayList.add("O");
        ParametrizedMethods.getAllElements(arrayList);
    }
}
