package org.utils;

import org.objects.User;

import static org.AppRunner.LOGGER;

public class UserDataRepresent {

    public static void representDataset(User user){
        double index = user.calcMassIndex(user.getHeight(),
                user.getMass());
        LOGGER.info("Mass index of user " + user.getFirstName() + " " +
                user.getSecondName() + " is " + index);
        LOGGER.info("Result of test: ");
        user.analyzeIndex(index);
    }
}
