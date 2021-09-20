package org.objects;

import java.util.logging.Logger;

abstract sealed public class Shape permits Square {
    public static final Logger LOGGER = Logger.getLogger(Shape.class.getName());

    abstract Double perimeter();
    abstract Double area();
    void showInfo() {
        LOGGER.info("Everything is OK");
    }
}
