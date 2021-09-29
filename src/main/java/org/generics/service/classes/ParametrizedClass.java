package org.generics.service.classes;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> infoString = new Info<>("Max");
        Info<Integer> infoInteger = new Info<>(122);
        System.out.println(infoInteger);
        System.out.println(infoString);
    }
}
