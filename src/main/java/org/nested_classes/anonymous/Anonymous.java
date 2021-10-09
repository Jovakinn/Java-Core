package org.nested_classes.anonymous;

import org.nested_classes.Nested;

import java.util.logging.Logger;

public class Anonymous {
    private static final Logger logger = Logger.getLogger(Anonymous.class.getName());

    public static void main(String[] args) {
        Math mathSum = new Math() {
            @Override
            public Integer doOperation(Integer value1, Integer value2) {
                return value1 + value2;
            }
        };
        Math mathMultiply = new Math() {
            @Override
            public Integer doOperation(Integer value1, Integer value2) {
                return value1 * value2;
            }
        };
        logger.info(String.valueOf(mathSum.doOperation(232, 454)));
        logger.info(String.valueOf(mathMultiply.doOperation(232, 454)));
    }
}
