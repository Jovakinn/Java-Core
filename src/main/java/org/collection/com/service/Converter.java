package org.collection.com.service;

import java.util.List;

public class Converter {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("A");
        StringBuilder stringBuilder3 = new StringBuilder("A");
        StringBuilder stringBuilder4 = new StringBuilder("A");

        StringBuilder[] stringBuilders = {stringBuilder1, stringBuilder2, stringBuilder3, stringBuilder4};
        List<StringBuilder> list = List.of(stringBuilders);
        System.out.println(list);
    }
}





