package org.utils;

import org.objects.User;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static org.AppRunner.LOGGER;

public class UserDataRepresent {

   public static void representCurrentUserTime() {
       LocalDateTime localDateTime = LocalDateTime.now();
       localDateTime = localDateTime.plusYears(56);
       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
       LOGGER.info(localDateTime.format(dateTimeFormatter));

       Date objDate = new Date();
       String strDateFormat = "hh:mm:ss a dd-MMM-yyyy";
       SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
       LOGGER.info(objSDF.format(objDate));
   }


    public static void representDataset(User user){
        double index = user.calcMassIndex(user.getHeight(),
                user.getMass());
        LOGGER.info("Mass index of user " + user.getFirstName() + " " +
                user.getSecondName() + " is " + index);
        LOGGER.info("Result of test: ");
        user.analyzeIndex(index);
    }
}