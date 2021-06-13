package org;

import org.Data.Human.Gender;
import org.objects.User;
import java.util.logging.Logger;

public class AppRunner {

    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());
    public static void main( String[] args ) {

        // User Nastya
        User userNastya = new User("Nastya", "Borodai",
                17, 11.0, Gender.FEMALE,
                170.0, 62.0);

       double indexNastya = userNastya.calcMassIndex(userNastya.getHeight(),
               userNastya.getMass());

       LOGGER.info("Mass index of user " + userNastya.getFirstName() + " " +
               userNastya.getSecondName() + " is " + indexNastya);
       LOGGER.info("Result of test: ");
       userNastya.analyzeIndex(indexNastya);

       //User Max
        User userMax = new User("Max", "Khodakov",
                17, 11.0, Gender.MAlE,
                180.0, 75.0);

        double indexMax = userMax.calcMassIndex(userMax.getHeight(),
                userMax.getMass());

        LOGGER.info("Mass index of user " + userMax.getFirstName() + " " +
                userMax.getSecondName() + " is " + indexMax);
        LOGGER.info("Result of test: ");
        userNastya.analyzeIndex(indexMax);
    }
}