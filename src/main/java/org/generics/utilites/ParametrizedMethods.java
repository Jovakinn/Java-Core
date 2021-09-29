package org.generics.utilites;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ParametrizedMethods {
    private static final Logger LOGGER = Logger.getLogger(ParametrizedMethods.class.getName());

    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }

    public static <T> void getAllElements(ArrayList<T> arrayList) {
        for (Object element : arrayList) {
            LOGGER.info(element.toString());
        }
    }
}
