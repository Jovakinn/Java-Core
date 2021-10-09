package org.nested_classes;

import java.util.logging.Logger;

public class Runner {

    private static final Logger logger = Logger.getLogger(Runner.class.getName());
    public static void main(String[] args) {
        Nested.SuperInner superInner = new Nested.SuperInner(122);
        logger.info(String.valueOf(superInner));

        Nested nested = new Nested("1", 777);
        nested.method();
    }
}
