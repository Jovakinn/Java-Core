package org;

import org.Data.Animal.Animal;
import java.util.logging.Logger;

public class AppRunner implements Animal {

    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    @Override
    public void makeNoise() {
        LOGGER.info("Hello world ! Or I want to say meow");
        LOGGER.info("Hello world ! But I want to add oph");
    }

    public static void main( String[] args ) {
        AppRunner appRunner = new AppRunner();
        appRunner.makeNoise();
    }
}