package org.generics.utilites;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ParametrizedMethods {
    private static final Logger LOGGER = Logger.getLogger(ParametrizedMethods.class.getName());

    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }

    public static void showList(List<?> list) {
        LOGGER.info(String.valueOf(list));
    }

    public static double sum(ArrayList<? extends Number> elements){
        double sum = 0.0;
        for (Number number : elements)
            sum += number.doubleValue();
        return sum;
    }

    public static <T> void getAllElements(ArrayList<T> arrayList) {
        for (Object element : arrayList) {
            LOGGER.info(element.toString());
        }
    }
}
